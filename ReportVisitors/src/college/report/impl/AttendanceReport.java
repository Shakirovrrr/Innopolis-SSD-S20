package college.report.impl;

import college.report.Report;
import college.report.utils.Visitor;

import java.util.Date;

/**
 * Attendance report.
 */
public class AttendanceReport implements Report {
	private int studentID;
	private String studentName;

	/**
	 * Add the subject which student attended.
	 *
	 * @param subject Subject name.
	 * @param date    Class date.
	 */
	public void addAttended(String subject, Date date) {

	}

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

	}
}
