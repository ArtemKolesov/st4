package ua.nure.kolesov.SummaryTask4.db.bean;

import java.sql.Date;

import ua.nure.kolesov.SummaryTask4.db.entity.Entity;

/**
 * Stores information of each worker in the DB.
 * 
 * Such as id, name, surname, position of the worker and their id, date of
 * birth, id of the crew worker belong to.
 *
 */
public class StaffBean extends Entity {

	private static final long serialVersionUID = 3031891530480032011L;

	private String name;
	private String surname;
	private int positionId;
	private String position;
	private Date birthdate;
	private int crewId;

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPositionId() {
		return positionId;
	}

	public String getPosition() {
		return position;
	}

	public Date getBirthdate() {
		return new Date(birthdate.getTime());
	}

	public int getCrewId() {
		return crewId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = new Date(birthdate.getTime());
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	@Override
	public String toString() {
		return "StaffBean [name=" + name + ", surename=" + surname
				+ ", positionId=" + positionId + ", position=" + position
				+ ", birthdate=" + birthdate + ", crewId=" + crewId
				+ ", getId()=" + getId() + "]";
	}
}
