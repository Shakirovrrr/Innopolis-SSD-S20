package report;

import java.util.Date;

/**
 * Subject-wise attendance report.
 */
public class SubjectWiseAttendanceReport implements AttendanceReport {
	private String studentID;
	private String studentName;

	public SubjectWiseAttendanceReport(String studentID, String studentName) {
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
