package college.report.type.impl;

import college.report.type.ReportType;

import java.util.Date;

/**
 * Date-wise report type.
 */
public class DatewiseReport implements ReportType {
	private Date date;

	/**
	 * Get the report date.
	 *
	 * @return Report date.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Set the report date.
	 *
	 * @param date Report date.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getReportType() {
		return null;
	}
}
