package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.Airport;
import ua.nure.kolesov.SummaryTask4.db.CrewStatus;
import ua.nure.kolesov.SummaryTask4.db.FlightStatus;
import ua.nure.kolesov.SummaryTask4.db.Position;
import ua.nure.kolesov.SummaryTask4.db.RequestStatus;
import ua.nure.kolesov.SummaryTask4.db.Role;
import ua.nure.kolesov.SummaryTask4.db.entity.User;

public class EnumTest {

	@Test
	public final void testAirport() {
		int expected = 1;
		for (Airport a : Airport.values()) {
			int actual = a.getId();
			assertEquals(expected, actual);
			++expected;
		}
	}
	
	@Test
	public final void testCrewStat() {
		int expected = 1;
		for (CrewStatus cs : CrewStatus.values()) {
			int actual = cs.getId();
			assertEquals(expected, actual);
			expected++;
		}
	}
	
	@Test
	public final void testFlightStat() {
		int expected = 1;
		for (FlightStatus fs : FlightStatus.values()) {
			int actual = fs.getId();
			assertEquals(expected, actual);
			++expected;
		}
	}

	@Test
	public final void testPosition() {
		int expected = 1;
		for (Position p : Position.values()) {
			int actual = p.getId();
			assertEquals(expected, actual);
			++expected;
		}
	}
	
	@Test
	public final void testRequestStat() {
		int expected = 1;
		for (RequestStatus rs : RequestStatus.values()) {
			int actual = rs.getId();
			assertEquals(expected, actual);
			++expected;
		}
	}
	@Test
	public final void testRole() {
		User u = new User();
		u.setRoleId(1);
		for (Role r : Role.values()) {
			String expected = r.name().toLowerCase();
			String actual = r.getName();
			assertEquals(expected, actual);
			u.setRoleId(2);
		}
	}
	@SuppressWarnings("static-access")
	@Test
	public final void testRoleId() {
		User u = new User();
		u.setRoleId(1);
		for (Role r : Role.values()) {
			String expected = r.name();
			String actual = r.getRole(u).name();
			assertEquals(expected, actual);
			u.setRoleId(2);
		}
	}
}
