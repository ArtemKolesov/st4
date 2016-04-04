package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.bean.FlightBean;

public class FlightBeanTest {
	String name;
	String departure;
	String arrival;
	Date date;
	long crewId;
	String crewStatus;
	String flightStatus;
	FlightBean fb;

	@Before
	public void setUp() throws Exception {
		name = "DF 098";
		departure = "dep";
		arrival = "arr";
		date = Date.valueOf("2015-09-09");
		crewId = 6;
		crewStatus = "stat";
		flightStatus = "fstat";
		fb = new FlightBean();
		fb.setName(name);
		fb.setDeparture(departure);
		fb.setArrival(arrival);
		fb.setDate(date);
		fb.setCrewId(crewId);
		fb.setCrewStatus(crewStatus);
		fb.setFlightStatus(flightStatus);
	}

	@After
	public void tearDown() throws Exception {
		fb = null;
	}

	@Test
	public final void testName() {
		String expected = name;
		String actual = fb.getName();
		assertEquals(expected, actual);
	}
	@Test
	public final void testCrewId() {
		long expected = crewId;
		long actual = fb.getCrewId();
		assertEquals(expected, actual);
	}
	@Test
	public final void testDate() {
		Date expected = date;
		Date actual = fb.getDate();
		assertEquals(expected, actual);
		fb.toString();
	}
	@Test
	public final void testDep() {
		String expected = departure;
		String actual = fb.getDeparture();
		assertEquals(expected, actual);
	}
	@Test
	public final void testArr() {
		String expected = arrival;
		String actual = fb.getArrival();
		assertEquals(expected, actual);
	}
	@Test
	public final void testCrewStat() {
		String expected = crewStatus;
		String actual = fb.getCrewStatus();
		assertEquals(expected, actual);
	}
	@Test
	public final void testFlightStat() {
		String expected = flightStatus;
		String actual = fb.getFlightStatus();
		assertEquals(expected, actual);
	}

}
