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
import ua.nure.kolesov.SummaryTask4.exception.AppException;

/**
 * Command realization for changing locale.
 *
 */
public class LocaleCommand extends Command {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(LocaleCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		String localeToSet = request.getParameter("localeToSet");
		String forward = null;
		if (localeToSet != null && !localeToSet.isEmpty()) {
			HttpSession session = request.getSession();
			Config.set(session, "javax.servlet.jsp.jstl.fmt.locale",
					localeToSet);
			session.setAttribute("defaultLocale", localeToSet);
			Locale.setDefault(new Locale(localeToSet));
			LOG.debug("lacale: " + localeToSet);
			String redirect = "/controller?command=main";
			request.setAttribute("redirect", redirect);
			forward = Path.PAGE_REDIRECT;

		}
		return forward;
	}

}
