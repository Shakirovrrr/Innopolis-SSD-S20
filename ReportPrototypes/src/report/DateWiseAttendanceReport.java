package report;

import java.util.Date;

/**
 * Date-wise attendance report.
 *
 * @see AttendanceReport
 */
public class DateWiseAttendanceReport extends AttendanceReport {
	private Date date;

	/**
	 * Create new date-wise attendance report.
	 *
	 * @param date Date for report.
	 */
	public DateWiseAttendanceReport(Date date) {
		this.date = date;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateWiseAttendanceReport clone() throws CloneNotSupportedException {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}
}
