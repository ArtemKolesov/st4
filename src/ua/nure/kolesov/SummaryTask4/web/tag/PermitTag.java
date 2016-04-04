package ua.nure.kolesov.SummaryTask4.web.tag;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import ua.nure.kolesov.SummaryTask4.db.entity.User;

/**
 * Denied access for the non logged user.
 *
 */
public class PermitTag extends TagSupport {

	private static final long serialVersionUID = 4097617313156061564L;
	private User u;

	public void setU(User u) {
		this.u = u;
	}

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request = (HttpServletRequest) pageContext
				.getRequest();
		HttpServletResponse response = (HttpServletResponse) pageContext
				.getResponse();
		if (u == null) {
			request.setAttribute("errorMessage", "Access denied");
			String forward = "/WEB-INF/jsp/error/error_page.jsp";
			try {
				request.getRequestDispatcher(forward)
						.forward(request, response);
			} catch (ServletException | IOException e) {
				throw new JspException("Acess denied!", e);
			}
		}
		return SKIP_BODY;
	}
}
