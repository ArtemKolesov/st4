package ua.nure.kolesov.SummaryTask4.db.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.db.DBManager;
import ua.nure.kolesov.SummaryTask4.db.entity.Crew;
import ua.nure.kolesov.SummaryTask4.exception.DBException;
import ua.nure.kolesov.SummaryTask4.exception.Message;

/**
 * Stores CRUD methods for crew table in DB.
 *
 */
public final class CrewDAO {
	private CrewDAO() {
	}

	private static final Logger LOG = Logger.getLogger(CrewDAO.class);
	private static final String SQL_FIND_CREWS = "SELECT crew.id, crew.crew_status_id, crew_status.name FROM crew, crew_status where crew.crew_status_id = crew_status.id";
	private static final String SQL_CHANGE_STATUS = "UPDATE `st4`.`crew` SET `crew_status_id`=? WHERE `id`=?";
	private static final String SQL_CREATE_CREW = "INSERT INTO `st4`.`crew` VALUES (?, ?)";
	private static final String SQL_DELETE_CREW = "DELETE FROM `st4`.`crew` WHERE `id`=?";
	private static final String SQL_FIND_FLIGHT_NUMBER = "SELECT flights.crew_id, count(*) FROM st4.flights where crew_id=? group by crew_id";
	private static final String SQL_FLIGHT_DATES = "SELECT flights.crew_id, date FROM st4.flights where crew_id=?";
	private static final String SQL_FIND_CREW = "SELECT crew.id, crew.crew_status_id, crew_status.name FROM crew, crew_status where crew.crew_status_id = crew_status.id and crew.id=?";
	/**
	 * Find list if the crews from the DB.
	 * 
	 * @return crews The list of all crews in the DB
	 * @throws DBException
	 */
	public static List<Crew> findCrews() throws DBException {
		List<Crew> crews = new ArrayList<Crew>();
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			st = cn.createStatement();
			rs = st.executeQuery(SQL_FIND_CREWS);
			while (rs.next()) {
				crews.add(extrtactCrew(rs));
			}
			cn.commit();
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("cannot obtain crews", e);
			throw new DBException("cannot find crews", e);
		} finally {
			manager.close(cn);
			manager.close(st);
			manager.close(rs);
		}
		return crews;
	}

	public static Crew findCrew(long id) throws DBException {
		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		Crew crew = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			st = cn.prepareStatement(SQL_FIND_CREW);
			st.setLong(1, id);
			rs = st.executeQuery();
			while (rs.next()) {
				crew = extrtactCrew(rs);
			}
			cn.commit();
		} catch (SQLException e) {
			manager.rollback(cn);
			throw new DBException("cannot find crew", e);
		} finally {
			manager.close(cn);
			manager.close(st);
			manager.close(rs);
		}
		return crew;
	}

	/**
	 * Change status of the current flight.
	 * 
	 * @param id
	 *            Flight id to change
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
			LOG.error("Cannot update crew status", e);
			throw new DBException("Cannot update crew status", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
	}

	/**
	 * Extract crew entity from the DB.
	 * 
	 * @param rs
	 *            ResultSet from another method.
	 * @return crew Crew, found in DB
	 * @throws SQLException
	 * @throws DBException
	 */
	private static Crew extrtactCrew(ResultSet rs) throws SQLException,
			DBException {
		Crew crew = new Crew();
		crew.setId(rs.getLong(1));
		crew.setStatusId(rs.getInt(2));
		crew.setStatus(rs.getString(3));
		crew.setFlightNumber(flightNumber(crew.getId()));
		crew.setFlightDates(flightDates(crew.getId()));
		return crew;
	}

	/**
	 * Create new crew.
	 * 
	 * @param id
	 *            Id of hte new crew
	 * @throws DBException
	 */
	public static void create(long id) throws DBException {
		LOG.info("create started");
		PreparedStatement ps = null;
		Connection cn = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_CREATE_CREW);
			ps.setLong(1, id);
			ps.setInt(2, 2);
			ps.executeUpdate();
			cn.commit();
			LOG.info("Crew created");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Cannot create crew", e);
			throw new DBException("Cannot create crew", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
	}

	/**
	 * Delete current crew.
	 * 
	 * @param id
	 *            Crew id to delete
	 * @throws DBException
	 */
	public static void delete(long id) throws DBException {
		LOG.info("delete started");
		PreparedStatement ps = null;
		Connection cn = null;
		DBManager manager = DBManager.getInstance();

		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_DELETE_CREW);
			ps.setLong(1, id);
			ps.executeUpdate();
			cn.commit();
			LOG.info("Crew deleted");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error(Message.ERR_DELETE_CREW, e);
			throw new DBException(Message.ERR_DELETE_CREW, e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
	}

	public static int flightNumber(long id) throws DBException {
		int fNum = 0;
		PreparedStatement ps = null;
		Connection cn = null;
		ResultSet rs = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_FIND_FLIGHT_NUMBER);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				fNum = rs.getInt(2);
			}
			cn.commit();
			LOG.debug("id: ");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Cannot calculate flight number", e);
			throw new DBException("Cannot calculate flight number", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
		}
		return fNum;
	}

	public static List<Date> flightDates(long id) throws DBException {
		List<Date> dates = new ArrayList<Date>();
		PreparedStatement ps = null;
		Connection cn = null;
		ResultSet rs = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_FLIGHT_DATES);
			ps.setLong(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				dates.add(rs.getDate(2));
			}
			cn.commit();
			LOG.debug("id: ");
		} catch (SQLException e) {
			manager.rollback(cn);
			LOG.error("Cannot obtain crew dates", e);
			throw new DBException("Cannot obtain crew dates", e);
		} finally {
			manager.close(ps);
			manager.close(cn);
			manager.close(rs);
			
		}
		return dates;
	}
}
