package ua.nure.kolesov.SummaryTask4.db.entity;

import java.sql.Date;

/**
 * Stores information of each flight in the DB.
 * 
 * Parameters: id(Entity), name, departure/arrival airport id, departure date,
 * crew id, status id.
 *
 */
public class Flight extends Entity {
	private static final long serialVersionUID = 2035864165485711346L;
	private String name;
	private int departure;
	private int arrival;
	private Date date;
	private int crewId;
	private int statusId;

	public String getName() {
		return name;
	}

	public int getDeparture() {
		return departure;
	}

	public int getArrival() {
		return arrival;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	public int getCrewId() {
		return crewId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeparture(int departure) {
		this.departure = departure;
	}

	public void setArrival(int arrival) {
		this.arrival = arrival;
	}

	public void setDate(Date date) {
		this.date = new Date(date.getTime());
	}

	public void setCrewId(int crewId) {
		this.crewId = crewId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Flight() {
	}

	@Override
	public String toString() {
		return "Flight [name=" + name + ", departure=" + departure
				+ ", arrival=" + arrival + ", date=" + date + ", crewId="
				+ crewId + ", statusId=" + statusId + ", getId()=" + getId()
				+ "]";
	}

}
