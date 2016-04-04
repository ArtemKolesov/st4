package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.entity.Request;

public class RequestTest {
	int pilotNumber;
	int navigatorNumber;
	int operatorNumber;
	int hostessNumber;
	long crewId;
	int requestStatusId;
	String status;
	Request request;

	@Before
	public void setUp() throws Exception {
		pilotNumber = 1;
		navigatorNumber = 1;
		operatorNumber = 1;
		hostessNumber = 1;
		crewId = 1l;
		requestStatusId = 1;
		status = "new";
		request = new Request();
		request.setCrewId(crewId);
		request.setHostessNumber(hostessNumber);
		request.setNavigatorNumber(navigatorNumber);
		request.setOperatorNumber(operatorNumber);
		request.setPilotNumber(pilotNumber);
		request.setStatus(status);
		request.setRequestStatusId(requestStatusId);
	}

	@After
	public void tearDown() throws Exception {
		request = null;
	}

	@Test
	public final void testPilot() {
		int expected = pilotNumber;
		int actual = request.getPilotNumber();
		assertEquals(expected, actual);
	}
	@Test
	public final void testNavigator() {
		int expected = navigatorNumber;
		int actual = request.getNavigatorNumber();
		assertEquals(expected, actual);
	}
	@Test
	public final void testOperator() {
		int expected = operatorNumber;
		int actual = request.getOperatorNumber();
		assertEquals(expected, actual);
	}
	@Test
	public final void testHostess() {
		int expected = hostessNumber;
		int actual = request.getHostessNumber();
		assertEquals(expected, actual);
	}
	@Test
	public final void testStatusId() {
		int expected = requestStatusId;
		int actual = request.getRequestStatusId();
		assertEquals(expected, actual);
	}
	@Test
	public final void testCrewId() {
		long expected = crewId;
		long actual = request.getCrewId();
		assertEquals(expected, actual);
	}
	@Test
	public final void testStatus() {
		String expected = status;
		String actual = request.getStatus();
		assertEquals(expected, actual);
		request.toString();
	}

}
