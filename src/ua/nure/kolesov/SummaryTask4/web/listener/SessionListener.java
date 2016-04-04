package ua.nure.kolesov.SummaryTask4.web.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.log4j.Logger;

/**
 * Session listener.
 *
 */
public class SessionListener implements HttpSessionAttributeListener {
	private static final Logger LOG = Logger.getLogger(SessionListener.class);
	private static final String COL = " : ";

	@Override
	public void attributeAdded(HttpSessionBindingEvent ev) {
		LOG.debug("add: " + ev.getClass().getSimpleName() + COL + ev.getName()
				+ COL + ev.getValue());

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent ev) {
		LOG.debug("remove: " + ev.getClass().getSimpleName() + COL
				+ ev.getName() + COL + ev.getValue());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent ev) {
		LOG.debug("replace: " + ev.getClass().getSimpleName() + COL
				+ ev.getName() + COL + ev.getValue());

	}

}