package report.factory;

import report.Report;

/**
 * Abstract factory for reports.
 */
public interface AbstractReportFactory {
	/**
	 * Create report for specific student.
	 *
	 * @param studentID Student ID
	 * @return Generated report
	 */
	Report makeReport(String studentID);
}
