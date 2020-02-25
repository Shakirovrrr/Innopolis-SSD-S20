package report.factory;

import report.DateWiseAttendanceReport;

/**
 * Factory for generating date-wise attendance reports.
 */
public class DateWiseAttendanceReportFactory extends AttendanceReportFactory {
	/**
	 * Create report for specific student.
	 *
	 * @param studentID Student ID
	 * @return Generated report
	 */
	@Override
	public DateWiseAttendanceReport makeReport(String studentID) {
		return null;
	}
}
