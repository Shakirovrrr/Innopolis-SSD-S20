package report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Student's marks sheet.
 */
public class MarksSheet implements Report {
	private String studentID;
	private String studentName;

	private Map<String, List<Character>> marks;

	public MarksSheet(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		this.marks = new HashMap<>();
	}

	/**
	 * Print the created report.
	 */
	@Override
	public void print() {

	}

	/**
	 * Add marks for subject.
	 *
	 * @param subject Subject
	 * @param marks   Marks list
	 */
	public void addRecord(String subject, List<Character> marks) {

	}
}
