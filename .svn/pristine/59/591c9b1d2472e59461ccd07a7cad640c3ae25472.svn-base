package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.entity.Crew;

public class CrewTest {

	protected long id;
	protected int statusId;
	protected String status;
	Crew crew = null;

	@Before
	public void setUp() {
		id = 1;
		statusId = 1;
		status = "ready";
		crew = new Crew();
		crew.setId(id);
		crew.setStatusId(statusId);
		crew.setStatus(status);
	}

	@Test
	public final void testId() {
		long expectedId = id;
		long actualId = crew.getId();
		assertEquals(expectedId, actualId);
	}

	@Test
	public final void testStatusId() {
		int expectedStatusId = statusId;
		int actualStatusId = crew.getStatusId();
		assertEquals(expectedStatusId, actualStatusId);
	}

	@Test
	public final void testStatus() {
		String expectedStatus = status;
		String actualStatus = crew.getStatus();
		assertEquals(expectedStatus, actualStatus);
		crew.toString();
	}
	
	@After 
	public void clean() {
		crew = null;
	}
	

}
