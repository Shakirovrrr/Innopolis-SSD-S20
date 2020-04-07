package college.report;

import college.report.type.ReportType;

/**
 * Automated report.
 */
public abstract class Report {
	/**
	 * Report type.
	 */
	private ReportType reportType;

	/**
	 * Print the report.
	 */
	public abstract void print();

	/**
	 * Get the report type.
	 *
	 * @return Report type.
	 */
	public ReportType getReportType() {
		return reportType;
	}

	/**
	 * Set the report type.
	 *
	 * @param reportType Report type.
	 */
	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}
}
