package report;

import java.util.Date;

/**
 * Attendance reports.
 *
 * @see ReportPrototype
 */
public abstract class AttendanceReport implements ReportPrototype {
	protected int studentID;
	protected String studentName;

	/**
	 * Add attendee.
	 *
	 * @param name Attendee name.
	 * @param date Attendance date.
	 */
	public void addAttended(String name, Date date) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract AttendanceReport clone() throws CloneNotSupportedException;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public abstract void print();
}
