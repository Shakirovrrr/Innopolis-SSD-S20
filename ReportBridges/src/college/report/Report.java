package college.report;

import college.report.type.ReportType;

public abstract class Report {
	private ReportType reportType;

	public abstract void print();

	public ReportType getReportType() {
		return reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}
}
