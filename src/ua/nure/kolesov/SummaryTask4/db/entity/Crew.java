package ua.nure.kolesov.SummaryTask4.db.entity;

import java.sql.Date;
import java.util.List;

/**
 * Stores information of each crew in the DB (id, statusId, status). 
 *
 */
public class Crew extends Entity {

	private static final long serialVersionUID = -8651688329601992806L;

	private int statusId;
	private String status;
	private int flightNumber;
	private List<Date> flightDates;
	public List<Date> getFlightDates() {
		return flightDates;
	}

	public void setFlightDates(List<Date> flightDates) {
		this.flightDates = flightDates;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "Crew [statusId=" + statusId + ", getId()=" + getId() + "]";
	}

}
