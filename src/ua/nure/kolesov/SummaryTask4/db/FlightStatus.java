package ua.nure.kolesov.SummaryTask4.db;

/**
 * Flight statuses.
 *
 */
public enum FlightStatus {
	SCHEDULED(1), ACTIVE(2), LENDED(3), CANSELED(4), NOT_OPERATIONAL(5), PREPARATION(6);

	private int id;

	public int getId() {
		return id;
	}

	private FlightStatus(int id) {
		this.id = id;
	}

}
