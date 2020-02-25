package report;

import java.util.Date;

public class SubjectWiseAttendanceReport implements AttendanceReport {
	private String studentID;
	private String studentName;

	public SubjectWiseAttendanceReport(String studentID, String studentName) {
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
