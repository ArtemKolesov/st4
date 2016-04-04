package ua.nure.kolesov.SummaryTask4;

/**
 * Stores url's to forward to.
 *
 */
public final class Path {
	private Path() {
	}
	public static final String COMMAND_FLIGHTS = "/controller?command=flights";
	public static final String COMMAND_MAIN = "/controller?command=main";
	public static final String COMMAND_LOGIN = "/controller?command=login";
	public static final String COMMAND_LOGOUT = "/controller?command=logout";
	public static final String COMMAND_CREWS = "/controller?command=crews";
	public static final String COMMAND_STAFF = "/controller?command=staff";
	public static final String COMMAND_REQUESTS = "/controller?command=requests";
	public static final String COMMAND_LOCALE = "/controller?command=locale";

	public static final String PAGE_INDEX = "/index.jsp";
	public static final String PAGE_REDIRECT = "/WEB-INF/jsp/general/redirect.jsp";
	public static final String PAGE_MAIN = "/WEB-INF/jsp/general/main.jsp";
	public static final String PAGE_ERROR = "/WEB-INF/jsp/error/error_page.jsp";
	public static final String PAGE_CREWS = "/WEB-INF/jsp/general/crew/crews.jsp";
	public static final String PAGE_FLIGHTS = "/WEB-INF/jsp/general/flight/flights.jsp";
	public static final String PAGE_FLIGHT = "/WEB-INF/jsp/general/flight/flight.jsp";
	public static final String PAGE_REQUEST = "/WEB-INF/jsp/general/request/request.jsp";
	public static final String PAGE_STAFF = "/WEB-INF/jsp/general/staff/staff.jsp";
}
