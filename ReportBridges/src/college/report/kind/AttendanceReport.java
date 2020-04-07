package college.report.kind;

import college.report.Report;

import java.util.Date;
import java.util.Map;

/**
 * Attendance report.
 */
public class AttendanceReport extends Report {
	private Map<Integer, String> students;

	/**
	 * Add attendee on specific date.
	 *
	 * @param studentName Student name.
	 * @param date        Date.
	 */
	public void addAttended(String studentName, Date date) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}
}
