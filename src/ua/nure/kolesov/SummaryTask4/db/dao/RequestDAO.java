package ua.nure.kolesov.SummaryTask4.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.db.DBManager;
import ua.nure.kolesov.SummaryTask4.db.entity.Request;
import ua.nure.kolesov.SummaryTask4.exception.DBException;

/**
 * Stores CRUD methods for requests table in DB.
 *
 */
public final class RequestDAO {
	private RequestDAO() {
	}

	private static final Logger LOG = Logger.getLogger(RequestDAO.class);
	private static final String SQL_FIND_REQUESTS = "SELECT request.id, pilot_number, navigator_number, operator_number, hostess_number, crewid, request_status_id, request_status.name FROM st4.request, st4.request_status where request_status_id=request_status.id";
	private static final String SQL_CHANGE_STATUS = "UPDATE `st4`.`request` SET `request_status_id`=? WHERE `id`=?";
	private static final String SQL_CREATE_REQUEST = "INSERT INTO `st4`.`request` (`pilot_number`, `navigator_number`, `operator_number`, `hostess_number`, `crewid`) VALUES (?, ?, ?, ?, ?)";

	/**
	 * Find list of requests in the DB.
	 * 
	 * @return requests List of requests
	 * @throws DBException
	 */
	public static List<Request> findAll() throws DBException {
		List<Request> requests = new ArrayList<Request>();
		Statement st = null;
		ResultSet rs = null;
		Connection cn = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			st = cn.createStatement();
			rs = st.executeQuery(SQL_FIND_REQUESTS);
			while (rs.next()) {
				requests.add(extractRequest(rs));
			}
			cn.commit();
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Can not obtain request list: " + e);
			throw new DBException("Can not obtain request list: ", e);
		} finally {
			manager.close(rs);
			manager.close(st);
			manager.close(cn);
		}
		return requests;
	}

	/**
	 * Extract request from the DB.
	 * 
	 * @param rs
	 *            ResultSet
	 * @return request Request, that was found id DB
	 * @throws SQLException
	 */
	private static Request extractRequest(ResultSet rs) throws SQLException {
		Request request = new Request();
		request.setId(rs.getLong(1));
		request.setPilotNumber(rs.getInt(2));
		request.setNavigatorNumber(rs.getInt(3));
		request.setOperatorNumber(rs.getInt(4));
		request.setHostessNumber(rs.getInt(5));
		request.setCrewId(rs.getLong(6));
		request.setRequestStatusId(rs.getInt(7));
		request.setStatus(rs.getString(8));
		return request;
	}

	/**
	 * Change status of the current request.
	 * 
	 * @param id
	 *            Id of the request to change to
	 * @param statusId
	 *            Status to change
	 * @throws DBException
	 */
	public static void changeStatus(long id, int statusId) throws DBException {
		LOG.info("change status started");
		PreparedStatement ps = null;
		Connection cn = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_CHANGE_STATUS);
			ps.setInt(1, statusId);
			ps.setLong(2, id);
			ps.executeUpdate();
			cn.commit();
			LOG.info("update finished");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Can not update request status", e);
			throw new DBException("Can not request crew status", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
	}

	/**
	 * Create new request and put it in the DB.
	 * 
	 * @param pilotNumber
	 *            Number of pilots
	 * @param navigatorNumber
	 *            Number of navigators
	 * @param operatorNumber
	 *            Number of operators
	 * @param hostessNumber
	 *            Number of hostesses
	 * @param crewId
	 *            Id of crew for request
	 * @throws DBException
	 */
	public static void create(int pilotNumber, int navigatorNumber,
			int operatorNumber, int hostessNumber, long crewId)
			throws DBException {
		LOG.info("create started");
		PreparedStatement ps = null;
		Connection cn = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_CREATE_REQUEST,
					Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, pilotNumber);
			ps.setInt(2, navigatorNumber);
			ps.setInt(3, operatorNumber);
			ps.setInt(4, hostessNumber);
			ps.setLong(5, crewId);
			ps.executeUpdate();
			cn.commit();
			LOG.info("Request created");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Can not create request", e);
			throw new DBException("Can not create request", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
	}
}
