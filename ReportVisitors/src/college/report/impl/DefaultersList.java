package college.report.impl;

import college.report.Report;
import college.report.utils.Visitor;

import java.util.List;

/**
 * Defaulters list.
 */
public class DefaultersList implements Report {
	private List<String> defaulters;

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
		visitor.visitDefaultersList(this);
	}
}
