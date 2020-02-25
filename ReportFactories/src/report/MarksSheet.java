package report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarksSheet implements Report {
	private String studentID;
	private String studentName;

	private Map<String, List<Character>> marks;

	public MarksSheet(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		this.marks = new HashMap<>();
	}

	@Override
	public void print() {

	}

	public void addRecord(String subject, List<Character> marks) {

	}
}
