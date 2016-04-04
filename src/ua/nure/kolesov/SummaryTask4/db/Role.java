package ua.nure.kolesov.SummaryTask4.db;

import ua.nure.kolesov.SummaryTask4.db.entity.User;

/**
 * User roles.
 *
 */
public enum Role {
	ADMIN, CONTROLLER;
	
	public static Role getRole(User user) {
		int roleId = user.getRoleId();
		return Role.values()[roleId-1];
	}
	
	public String getName() {
		return name().toLowerCase();
	}
}
