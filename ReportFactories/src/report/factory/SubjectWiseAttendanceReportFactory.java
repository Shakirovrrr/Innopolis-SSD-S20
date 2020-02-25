package report.factory;

import report.SubjectWiseAttendanceReport;

/**
 * Factory for generating subject-wise attendance reports.
 */
public class SubjectWiseAttendanceReportFactory extends AttendanceReportFactory {
	/**
	 * Create report for specific student.
	 *
	 * @param studentID Student ID
	 * @return Generated report
	 */
	@Override
	public SubjectWiseAttendanceReport makeReport(String studentID) {
		return null;
	}
}
