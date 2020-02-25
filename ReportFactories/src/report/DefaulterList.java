package report;

public class DefaulterList implements Report {
	private String studentID;
	private String studentName;

	public DefaulterList(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public void print() {

	}

	public void addRecord(String subject) {

	}
}
