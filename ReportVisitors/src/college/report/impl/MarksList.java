package college.report.impl;

import college.report.Report;
import college.report.utils.Visitor;

import java.util.List;
import java.util.Map;

public class MarksList implements Report {
	private int studentID;
	private String studentName;
	private Map<String, List<Character>> marks;

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
		visitor.visitMarksList(this);
	}
}
