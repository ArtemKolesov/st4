package ua.nure.kolesov.SummaryTask4.web.command.option.sort;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

import ua.nure.kolesov.SummaryTask4.db.bean.StaffBean;

public final class SortStaff {

	private SortStaff() {
	}

	private static final Logger LOG = Logger.getLogger(SortStaff.class);

	public static void sort(List<StaffBean> staff, String sort) {
		if (sort == null || sort.equals("id")) {
			Collections.sort(staff, compateById);
			LOG.info("sort by id");
		} else if (sort.equals("position")) {
			Collections.sort(staff, compateByPosition);
			LOG.info("sort by position");
		} else if (sort.equals("surname")) {
			Collections.sort(staff, compateBySyrname);
			LOG.info("sort by surname");
		} else if (sort.equals("crew_id")) {
			Collections.sort(staff, compateByCrewId);
			LOG.info("sort by crew id");
		}
	}

	private static class CompareById implements Comparator<StaffBean>,
			Serializable {

		private static final long serialVersionUID = 1837293976900791146L;

		@Override
		public int compare(StaffBean o1, StaffBean o2) {
			return (int) (o1.getId() - o2.getId());
		}
	}

	private static Comparator<StaffBean> compateById = new CompareById();

	private static class CompareByPosition implements Comparator<StaffBean>,
			Serializable {

		private static final long serialVersionUID = -2043088731963880327L;

		@Override
		public int compare(StaffBean o1, StaffBean o2) {
			return o1.getPosition().compareTo(o2.getPosition());
		}
	}

	private static Comparator<StaffBean> compateByPosition = new CompareByPosition();

	private static class CompareBySurname implements Comparator<StaffBean>,
			Serializable {

		private static final long serialVersionUID = 5087487154296967708L;

		@Override
		public int compare(StaffBean o1, StaffBean o2) {
			return o1.getSurname().compareTo(o2.getSurname());
		}
	}

	private static Comparator<StaffBean> compateBySyrname = new CompareBySurname();

	private static class CompareByCrewId implements Comparator<StaffBean>,
			Serializable {

		private static final long serialVersionUID = -1439674900517578668L;

		@Override
		public int compare(StaffBean o1, StaffBean o2) {
			return (int) (o1.getCrewId() - o2.getCrewId());
		}
	}

	private static Comparator<StaffBean> compateByCrewId = new CompareByCrewId();

}
