package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.exception.AppException;

/**
 * Command realization for invalid command.
 *
 * Executes, if command name is incorrect or nonexistent. 
 */
public class NoCommand extends Command {

	private static final long serialVersionUID = -3741460986955158824L;

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		String errorMessage = "No such command";
		request.setAttribute("errorMessage", errorMessage);
		return Path.PAGE_ERROR;
	}

}
