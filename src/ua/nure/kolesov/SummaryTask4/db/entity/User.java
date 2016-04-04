package ua.nure.kolesov.SummaryTask4.db.entity;

/**
 * Stores information of each user in the DB.
 * 
 * Parameters: id, login. password, name, role id.
 *
 */
public class User extends Entity {

	private static final long serialVersionUID = -3878553665504617160L;

	private String login;

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	private String password;

	private String name;

	private int roleId;

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", name="
				+ name + ", roleId=" + roleId + ", getId()=" + getId() + "]";
	}

}
