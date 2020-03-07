package report.factory;

import report.Report;

/**
 * Factory for generating marks reports.
 */
public class MarksSheetFactory implements AbstractReportFactory {
	/**
	 * Create report for specific student.
	 *
	 * @param studentID Student ID
	 * @return Generated report
	 */
	@Override
	public Report makeReport(String studentID) {
		return null;
	}
}
