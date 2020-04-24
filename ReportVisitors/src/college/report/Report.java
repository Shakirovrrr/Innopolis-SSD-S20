package college.report;

import college.report.utils.Visitor;

/**
 * college.report.Report.
 */
public interface Report {
	/**
	 * Print the report.
	 */
	void print();

	/**
	 * Accept the visitor.
	 */
	void acceptVisitor(Visitor visitor);
}
