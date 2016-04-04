package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.exception.AppException;

/**
 * Command realization for main.
 * 
 * Redirect to the main page of the application.
 *
 */
public class MainCommand extends Command {

	private static final long serialVersionUID = 9023985990828922405L;
	private static final Logger LOG = Logger.getLogger(MainCommand.class);
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		LOG.info("main command started");
		return Path.PAGE_MAIN;
	}

}
