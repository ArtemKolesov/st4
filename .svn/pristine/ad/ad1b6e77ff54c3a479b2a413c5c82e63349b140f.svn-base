package ua.nure.kolesov.SummaryTask4.db.bean;

import java.sql.Date;

import ua.nure.kolesov.SummaryTask4.db.entity.Entity;

/**
 * Stores information of each flight in the DB.
 * 
 * There are id, name, departure airport name, arrival airport name, date of
 * departure, id of the flight's crew and it's status, status of the flight.
 *
 */
public class FlightBean extends Entity {

	private static final long serialVersionUID = -121103155051435008L;
	private String name;
	private String departure;
	private String arrival;
	private Date date;
	private long crewId;
	private String crewStatus;
	private String flightStatus;

	public String getName() {
		return name;
	}

	public String getDeparture() {
		return departure;
	}

	public String getArrival() {
		return arrival;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	public long getCrewId() {
		return crewId;
	}

	public String getCrewStatus() {
		return crewStatus;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public void setDate(Date date) {
		this.date = new Date(date.getTime());
	}

	public void setCrewId(long crewId) {
		this.crewId = crewId;
	}

	public void setCrewStatus(String crewStatus) {
		this.crewStatus = crewStatus;
	}

	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}

	public FlightBean() {
	}

	@Override
	public String toString() {
		return "FlightBean [name=" + name + ", departure=" + departure
				+ ", arrival=" + arrival + ", date=" + date + ", crewId="
				+ crewId + ", crewStatus=" + crewStatus + ", flightStatus="
				+ flightStatus + ", getId()=" + getId() + "]";
	}

}
