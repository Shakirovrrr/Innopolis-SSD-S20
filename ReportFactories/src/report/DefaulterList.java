package report;

public class DefaulterList implements Report {
	private String studentID;
	private String studentName;

	public DefaulterList(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	/**
	 * Print the created report.
	 */
	@Override
	public void print() {

	}

	/**
	 * Add subject with debt.
	 *
	 * @param subject Subject
	 */
	public void addRecord(String subject) {

	}
}
