package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.exception.AppException;
import ua.nure.kolesov.SummaryTask4.web.command.option.RequestOption;

/**
 * Command realization for request.
 *
 */
public class RequestCommand extends Command {

	private static final Logger LOG = Logger.getLogger(RequestCommand.class);
	private static final long serialVersionUID = -2060301862580940170L;

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		String forward = Path.PAGE_ERROR;
		String option = request.getParameter("option");
		forward = RequestOption.optionFactory(request, option);
		LOG.debug("options: " + option);
		return forward;
	}

}
