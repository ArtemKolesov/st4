package ua.nure.kolesov.SummaryTask4.db.entity;

/**
 * Stores information of each request in the DB.
 * 
 * Parameters: id, number of pilots/navigators/operators/hostesses, crew id,
 * request status id, status(String value).
 */
public class Request extends Entity {

	private static final long serialVersionUID = 7208935849380289877L;

	private int pilotNumber;
	private int navigatorNumber;
	private int operatorNumber;
	private int hostessNumber;
	private long crewId;
	private int requestStatusId;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPilotNumber() {
		return pilotNumber;
	}

	public int getNavigatorNumber() {
		return navigatorNumber;
	}

	public int getOperatorNumber() {
		return operatorNumber;
	}

	public int getHostessNumber() {
		return hostessNumber;
	}

	public long getCrewId() {
		return crewId;
	}

	public int getRequestStatusId() {
		return requestStatusId;
	}

	public void setPilotNumber(int pilotNumber) {
		this.pilotNumber = pilotNumber;
	}

	public void setNavigatorNumber(int navigatorNumber) {
		this.navigatorNumber = navigatorNumber;
	}

	public void setOperatorNumber(int operatorNumber) {
		this.operatorNumber = operatorNumber;
	}

	public void setHostessNumber(int hostessNumber) {
		this.hostessNumber = hostessNumber;
	}

	public void setCrewId(long crewId) {
		this.crewId = crewId;
	}

	public void setRequestStatusId(int requestStatusId) {
		this.requestStatusId = requestStatusId;
	}

	@Override
	public String toString() {
		return "Request [pilotNumber=" + pilotNumber + ", navigatorNumber="
				+ navigatorNumber + ", operatorNumber=" + operatorNumber
				+ ", hostessNumber=" + hostessNumber + ", crewId=" + crewId
				+ ", requestStatusId=" + requestStatusId + ", getId()="
				+ getId() + "]";
	}
}
