package ua.nure.kolesov.SummaryTask4.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.exception.AppException;
import ua.nure.kolesov.SummaryTask4.web.command.Command;
import ua.nure.kolesov.SummaryTask4.web.command.CommandContainer;

/**
 * Front controller.
 * 
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(Controller.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	/**
	 * Process commands and forwards to jsp's.
	 * 
	 * @param request  HttpServletRequest
	 * @param response HttpServletResponse
	 * @throws IOException
	 * @throws ServletException
	 */
	private void process(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String commandName = request.getParameter("command");
		Command command = CommandContainer.get(commandName);
		String forward = "/WEB-INF/jsp/error/error_page.jsp";
		LOG.debug(command +  " + "  + commandName);

		
		try {
			forward = command.execute(request, response);
			
		} catch (AppException ex) {
			request.setAttribute("errorMessage", ex.getMessage());
			LOG.error("forward: " + forward + ", exception: ", ex);
		}
		request.getRequestDispatcher(forward).forward(request, response);
	}
	


}
