package report;

import java.util.Date;

/**
 * Date-wise attendance report.
 */
public class DateWiseAttendanceReport implements AttendanceReport {
	private String studentID;
	private String studentName;

	public DateWiseAttendanceReport(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	/**
	 * Print the created report.
	 */
	@Override
	public void print() {

	}

	/**
	 * Add the attendance record.
	 *
	 * @param subject Subject
	 * @param date    Date
	 */
	@Override
	public void addAttended(String subject, Date date) {

	}
}
