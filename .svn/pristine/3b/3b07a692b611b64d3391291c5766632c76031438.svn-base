package ua.nure.kolesov.SummaryTask4.web.tag;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import ua.nure.kolesov.SummaryTask4.db.entity.Request;

/**
 * Generate view for the request.
 *
 */
public class RequestTag extends TagSupport {
	private static final long serialVersionUID = -4502435044026819074L;
	private Request r;
	public void setR(Request r) {
		this.r = r;
	}
	
	@Override
	public int doStartTag() throws JspException {
		ResourceBundle rb = ResourceBundle.getBundle("resources");
		final String oB = "<b>";
		final String cB = "</b> ";
		try {
			StringBuilder result = new StringBuilder();
			result.append("<p>" + rb.getString("request.number") + oB + r.getId()
					+ "</b>, " + rb.getString("request.for_crew") + oB + r.getCrewId() + cB + rb.getString("request.needs"));
			if (r.getPilotNumber() != 0) {
				result.append(rb.getString("request.pilot") + oB + r.getPilotNumber() + cB);
			}
			if (r.getNavigatorNumber() != 0) {
				result.append(rb.getString("request.navigator") + oB + r.getNavigatorNumber() + cB);
			}
			if (r.getOperatorNumber() != 0) {
				result.append(rb.getString("request.operator") + oB + r.getOperatorNumber() + cB);
			}
			if (r.getHostessNumber() != 0) {
				result.append(rb.getString("request.hostess") + oB + r.getHostessNumber() + cB);
			}
			result.append(rb.getString("request.status")  + oB + r.getStatus() + "</b>."+ "</p>");
			pageContext.getOut().write(result.toString());
		} catch (IOException e) {
			throw new JspException(e.getMessage(), e);
		}

		return SKIP_BODY;

	}
	
}
