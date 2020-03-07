package report;

/**
 * Subject-wise attendance report.
 *
 * @see AttendanceReport
 */
public class SubjectWiseAttendanceReport extends AttendanceReport {
	private String subject;

	/**
	 * Create new subject-wise attendance report.
	 *
	 * @param subject Subject to generate report.
	 */
	public SubjectWiseAttendanceReport(String subject) {
		this.subject = subject;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SubjectWiseAttendanceReport clone() throws CloneNotSupportedException {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}
}
