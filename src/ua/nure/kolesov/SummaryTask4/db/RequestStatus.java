package ua.nure.kolesov.SummaryTask4.db;

/**
 * Request statuses.
 *
 */
public enum RequestStatus {
	NEW(1), CONFIRMED(2), REJECTED(3);

	private int id;

	public int getId() {
		return id;
	}

	private RequestStatus(int id) {
		this.id = id;
	}
}
