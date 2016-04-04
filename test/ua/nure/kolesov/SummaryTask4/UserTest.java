package ua.nure.kolesov.SummaryTask4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ua.nure.kolesov.SummaryTask4.db.entity.User;

public class UserTest {
	String login;
	String password;
	String name;
	int roleId;
	User user;
	
	@Before
	public void setUp() {
		user = new User();
		login = "login";
		password = "pass";
		name = "name";
		roleId = 1;
		user.setLogin(login);
		user.setName(name);
		user.setPassword(password);
		user.setRoleId(roleId);
	}
	@Test
	public final void testLogin() {
		String expected = login;
		String actual = user.getLogin();
		assertEquals(expected, actual);
	}
	@Test
	public final void testPass() {
		String expected = password;
		String actual = user.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public final void testName() {
		String expected = name;
		String actual = user.getName();
		assertEquals(expected, actual);
	}
	@Test
	public final void testRoleId() {
		int expected = roleId;
		int actual = user.getRoleId();
		assertEquals(expected, actual);
		user.toString();
	}
}
