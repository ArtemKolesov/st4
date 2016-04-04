package ua.nure.kolesov.SummaryTask4.web.tag;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import ua.nure.kolesov.SummaryTask4.db.entity.User;

/**
 * Generate greeting for the logged user.
 *
 */
public class HelloTag extends TagSupport {
	private static final long serialVersionUID = -6324080646413113054L;
	private User u;

	public void setU(User u) {
		this.u = u;
	}

	@Override
	public int doStartTag() throws JspException {
		ResourceBundle rb = ResourceBundle.getBundle("resources");

		try {
			StringBuilder result = new StringBuilder("<div class=\"hello\">");
			result.append("<h1>" + rb.getString("main.hello") + u.getName()
					+ "<br>");
			if (u.getId() == 1) {
				result.append(rb.getString("main.admin"));
			} else {
				result.append(rb.getString("main.controller"));
			}
			result.append("</h1></div>");
			pageContext.getOut().write(result.toString());
		} catch (IOException e) {
			throw new JspException(e.getMessage(), e);
		}

		return SKIP_BODY;

	}
}
