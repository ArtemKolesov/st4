package ua.nure.kolesov.SummaryTask4.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.exception.DBException;

public final class DBManager {
	private static final Logger LOG = Logger.getLogger(DBManager.class);
	private static DBManager instance;
	private DataSource ds;

	public static synchronized DBManager getInstance() throws DBException {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	private DBManager() throws DBException {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/ST4DB");
			LOG.trace("Data source ==> " + ds);
		} catch (NamingException ex) {
			LOG.error("Messages.ERR_CANNOT_OBTAIN_DATA_SOURCE", ex);
			throw new DBException("Messages.ERR_CANNOT_OBTAIN_DATA_SOURCE", ex);
		}
	}

	/**
	 * Obtain connection from the pool.
	 * 
	 * @return connection from the pool
	 * @throws DBException
	 */
	public Connection getConnection() throws DBException {
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (SQLException ex) {
			LOG.error("CANNOT OBTAIN CONNECTION", ex);
			throw new DBException("Cannot obtain connection", ex);
		}
		return con;
	}

	/**
	 * Closes a connection.
	 * 
	 * @param con
	 *            Connection to be closed.
	 */
	public void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException ex) {
				LOG.error("ERR_CANNOT_CLOSE_CONNECTION", ex);
			}
		}
	}

	/**
	 * Closes a statement object.
	 */
	public void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException ex) {
				LOG.error("ERR_CANNOT_CLOSE_STATEMENT", ex);
			}
		}
	}

	/**
	 * Closes a result set object.
	 */
	public void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ex) {
				LOG.error("ERR_CANNOT_CLOSE_RESULTSET", ex);
			}
		}
	}

	/**
	 * Rollbacks a connection.
	 * 
	 * @param con
	 *            Connection to be rollbacked.
	 */
	public void rollback(Connection cn) {
		if (cn != null) {
			try {
				cn.rollback();
			} catch (SQLException ex) {
				LOG.error("Cannot rollback", ex);
			}
		}
	}
}
