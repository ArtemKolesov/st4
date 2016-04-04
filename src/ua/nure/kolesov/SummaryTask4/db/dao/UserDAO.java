package ua.nure.kolesov.SummaryTask4.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.db.DBManager;
import ua.nure.kolesov.SummaryTask4.db.entity.User;
import ua.nure.kolesov.SummaryTask4.exception.DBException;

/**
 * Obtain user from the DB.
 *
 */
public final class UserDAO {
	private UserDAO() {
	}

	private static final String SQL_FIND_USER = "SELECT * FROM st4.users WHERE login=? AND password=?";
	private static final Logger LOG = Logger.getLogger(UserDAO.class);

	/**
	 * Find user from the DB by login/password.
	 * 
	 * @param login
	 *            User login
	 * @param pass
	 *            User password
	 * @return User by login/password
	 * @throws DBException
	 */
	public static User find(String login, String pass) throws DBException {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		DBManager manager = DBManager.getInstance();
		try {
			cn = manager.getConnection();
			ps = cn.prepareStatement(SQL_FIND_USER);
			ps.setString(1, login);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = extractUser(rs);
			}
			cn.commit();
		} catch (SQLException ex) {
			manager.rollback(cn);
			LOG.error("can not obtain user", ex);
			throw new DBException("CANNOT OBTAIN USER", ex);
		} finally {
			manager.close(rs);
			manager.close(ps);
			manager.close(cn);
		}
		return user;
	}

	/**
	 * Extract user from the DB.
	 * 
	 * @param rs
	 *            ResultSet
	 * @return User
	 * @throws SQLException
	 */
	private static User extractUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getLong(1));
		user.setLogin(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setName(rs.getString(4));
		user.setRoleId(rs.getInt(5));
		LOG.debug("user" + user);
		return user;
	}
}
