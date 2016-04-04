package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.bean.StaffBean;

public class StaffTest {
	String name;
	String surname;
	int positionId;
	String position;
	Date birthdate;
	int crewId;
	StaffBean sb;

	@Before
	public void setUp() throws Exception {
		sb = new StaffBean();
		name = "name";
		surname = "surname";
		positionId = 1;
		position = "position";
		birthdate = Date.valueOf("1989-09-09");
		crewId = 3;
		sb.setName(name);
		sb.setSurname(surname);
		sb.setPosition(position);
		sb.setPositionId(positionId);
		sb.setBirthdate(birthdate);
		sb.setCrewId(crewId);
	}

	@After
	public void tearDown() throws Exception {
		sb = null;
	}

	@Test
	public final void testName() {
		String expected = name;
		String actual = sb.getName();
		assertEquals(expected, actual);
	}

	@Test
	public final void testSurname() {
		String expected = surname;
		String actual = sb.getSurname();
		assertEquals(expected, actual);
	}
	@Test
	public final void testDate() {
		Date expected = birthdate;
		Date actual = sb.getBirthdate();
		assertEquals(expected, actual);
		sb.toString();
	}

	@Test
	public final void testPosition() {
		String expected = position;
		String actual = sb.getPosition();
		assertEquals(expected, actual);
	}

	@Test
	public final void testCrewId() {
		int expected = crewId;
		int actual = sb.getCrewId();
		assertEquals(expected, actual);
	}
	

	@Test
	public final void testPositionId() {
		int expected = positionId;
		int actual = sb.getPositionId();
		assertEquals(expected, actual);
	}

}
