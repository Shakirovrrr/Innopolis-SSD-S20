package report.factory;

import report.DefaulterList;

/**
 * Factory for generating defaulter list reports.
 */
public class DefaulterListFactory implements AbstractReportFactory {
	/**
	 * Create report for specific student.
	 *
	 * @param studentID Student ID
	 * @return Generated report
	 */
	@Override
	public DefaulterList makeReport(String studentID) {
		return null;
	}
}
