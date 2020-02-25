package report;

import java.util.Date;

public class DateWiseAttendanceReport implements AttendanceReport {
	private String studentID;
	private String studentName;

	public DateWiseAttendanceReport(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public void print() {

	}

	@Override
	public void addAttended(String subject, Date date) {

	}
}
