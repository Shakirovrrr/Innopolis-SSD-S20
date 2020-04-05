package college.report.type.impl;

import college.report.type.ReportType;

import java.util.Date;

public class DatewiseReport implements ReportType {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String getReportType() {
		return null;
	}
}
