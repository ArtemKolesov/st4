package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.entity.Flight;

public class FlightTest {
	String name;
	int departure;
	int arrival;
	Date date;
	int crewId;
	int statusId;
	Flight flight;

	@Before
	public void setUp() throws Exception {
		flight = new Flight();
		name = "JY 434";
		departure = 12;
		arrival = 14;
		date = Date.valueOf("2015-05-12");
		crewId = 4;
		statusId = 3;
		flight.setArrival(arrival);
		flight.setCrewId(crewId);
		flight.setDate(date);
		flight.setDeparture(departure);
		flight.setName(name);
		flight.setStatusId(statusId);
	}

	@After
	public void tearDown() throws Exception {
		flight = null;
	}

	@Test
	public final void testArrival() {
		int expected = arrival;
		int actual = flight.getArrival();
		assertEquals(expected, actual);
	}
	@Test
	public final void testDeparture() {
		int expected = departure;
		int actual = flight.getDeparture();
		assertEquals(expected, actual);
	}
	@Test
	public final void testStatusId() {
		int expected = statusId;
		int actual = flight.getStatusId();
		assertEquals(expected, actual);
	}
	@Test
	public final void testCrewId() {
		int expected = crewId;
		int actual = flight.getCrewId();
		assertEquals(expected, actual);
	}
	@Test
	public final void testName() {
		String expected = name;
		String actual = flight.getName();
		assertEquals(expected, actual);
	}
	@Test
	public final void testDate() {
		Date expected = date;
		Date actual = flight.getDate();
		assertEquals(expected, actual);
		flight.toString();
	}

}
