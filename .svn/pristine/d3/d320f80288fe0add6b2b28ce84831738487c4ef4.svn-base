package ua.nure.kolesov.SummaryTask4.web.command.option.sort;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.nure.kolesov.SummaryTask4.db.entity.Crew;

public final class SortCrew {

	private SortCrew() {
	}

	public static void sort(List<Crew> crews) {
		Collections.sort(crews, compareById);
	}

	private static class CompareById implements Comparator<Crew>, Serializable {
		private static final long serialVersionUID = -1573481565177573283L;

		@Override
		public int compare(Crew o1, Crew o2) {
			return (int) (o1.getId() - o2.getId());
		}
	}

	private static Comparator<Crew> compareById = new CompareById();
}
