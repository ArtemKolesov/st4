package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.exception.AppException;
import ua.nure.kolesov.SummaryTask4.web.command.option.FlightOption;

/**
 * Command realization for flight.
 *
 */
public class FlightsCommand extends Command {

	private static final long serialVersionUID = -3093777765099246453L;
	private static final Logger LOG = Logger.getLogger(FlightsCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		LOG.info("Commands starts");
		String forward = Path.PAGE_ERROR;
		String option = request.getParameter("option");
		forward = FlightOption.optionFactory(request, option);
		LOG.info("Commands finished");
		return forward;
	}

}
