package college.report.impl;

import college.report.utils.Visitor;

/**
 * Subject-wise report.
 */
public class SubjectWiseAttendanceReport extends AttendanceReport {
	private String subject;

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
		visitor.visitSubjectWiseAttendanceReport(this);
	}
}
