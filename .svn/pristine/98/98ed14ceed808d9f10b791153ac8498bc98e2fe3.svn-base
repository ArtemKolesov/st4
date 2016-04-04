package ua.nure.kolesov.SummaryTask4.web.command;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.Path;
import ua.nure.kolesov.SummaryTask4.db.CrewStatus;
import ua.nure.kolesov.SummaryTask4.db.dao.CrewDAO;
import ua.nure.kolesov.SummaryTask4.db.entity.Crew;
import ua.nure.kolesov.SummaryTask4.exception.AppException;
import ua.nure.kolesov.SummaryTask4.web.command.option.CrewOption;
import ua.nure.kolesov.SummaryTask4.web.command.option.sort.SortCrew;

/**
 * Command realization for crew.
 *
 */
public class CrewsCommand extends Command {

	private static final long serialVersionUID = -5127945616587477692L;
	private static final Logger LOG = Logger.getLogger(CrewsCommand.class);

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException,
			AppException {
		LOG.info("Commands starts");

		Map<String, Integer> statuses = new TreeMap<String, Integer>();
		for (CrewStatus cs : CrewStatus.values()) {
			statuses.put(cs.name(), cs.getId());
		}
		request.setAttribute("statuses", statuses);

		String forward = Path.PAGE_ERROR;
		String option = request.getParameter("option");
		forward = CrewOption.optionFactory(request, option);
		List<Crew> crews = CrewDAO.findCrews();
		SortCrew.sort(crews);
		request.setAttribute("crews", crews);
		LOG.info("Commands finished");
		return forward;
	}

}
