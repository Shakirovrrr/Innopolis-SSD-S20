package college.report.impl;

import college.report.utils.Visitor;

import java.util.Date;

/**
 * Date-wise report type.
 */
public class DateWiseAttendanceReport extends AttendanceReport {
	private Date date;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visitDateWiseAttendanceReport(this);
	}
}
