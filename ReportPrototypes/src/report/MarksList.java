package report;

import java.util.List;
import java.util.Map;

/**
 * Marks list.
 *
 * @see ReportPrototype
 */
public class MarksList implements ReportPrototype {
	private int studentID;
	private String studentName;
	private Map<String, List<Character>> marks;

	/**
	 * Create new marks list.
	 *
	 * @param studentID ID of student to generate report.
	 */
	public MarksList(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MarksList clone() throws CloneNotSupportedException {
		return (MarksList) super.clone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}
}
