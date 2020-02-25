package report;

import java.util.Date;

/**
 * Interface for attendance reports.
 */
public interface AttendanceReport extends Report {
	/**
	 * Add the attendance record.
	 *
	 * @param subject Subject
	 * @param date    Date
	 */
	void addAttended(String subject, Date date);
}
