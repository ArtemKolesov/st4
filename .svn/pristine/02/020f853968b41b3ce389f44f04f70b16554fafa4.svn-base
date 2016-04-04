package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.db.Role;
import ua.nure.kolesov.SummaryTask4.db.dao.UserDAO;
import ua.nure.kolesov.SummaryTask4.db.entity.User;
import ua.nure.kolesov.SummaryTask4.exception.AppException;

/**
 *  * Command realization for login the user.
 *
 */
public class LoginCommand extends Command {

	private static final long serialVersionUID = -7415276852908053954L;
	private static final Logger LOG = Logger.getLogger(LoginCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		LOG.debug("login: " + login + " " + password);

		if (login == null || password == null || login.isEmpty()
				|| password.isEmpty()) {
			LOG.warn("login: Login/password cannot be empty");
			throw new AppException("Login/password cannot be empty");

		}

		User user = UserDAO.find(login, password);

		if (user == null) {
			LOG.info("login: Cannot find user with such login/password");
			throw new AppException("Cannot find user with such login/password");

		}

		Role userRole = Role.getRole(user);

		String forward = Path.PAGE_ERROR;
		String redirect = Path.COMMAND_MAIN;
		request.setAttribute("redirect", redirect);
		forward = Path.PAGE_REDIRECT;

		session.setAttribute("user", user);

		session.setAttribute("userRole", userRole);
		LOG.debug("role: " + userRole);
		locale(request);
		return forward;
	}

	/**
	 * Set the locale.
	 * 
	 * @param request HttpServletRequest
	 * @throws IOException
	 * @throws ServletException
	 */
	private void locale(HttpServletRequest request) throws IOException,
			ServletException {
		String localeToSet = request.getParameter("localeToSet");
		if (localeToSet != null && !localeToSet.isEmpty()) {
			HttpSession session = request.getSession();
			Config.set(session, "javax.servlet.jsp.jstl.fmt.locale",
					localeToSet);
			session.setAttribute("defaultLocale", localeToSet);
			Locale.setDefault(new Locale(localeToSet));
			LOG.debug("lacale: " + localeToSet);
		}
	}
}
