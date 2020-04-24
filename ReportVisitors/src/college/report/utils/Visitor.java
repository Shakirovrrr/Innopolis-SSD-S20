package college.report.utils;

import college.report.impl.DateWiseAttendanceReport;
import college.report.impl.DefaultersList;
import college.report.impl.MarksList;
import college.report.impl.SubjectWiseAttendanceReport;

/**
 * Visitor.
 */
public interface Visitor {
	/**
	 * Visit the defaulters list.
	 */
	void visitDefaultersList(DefaultersList defaultersList);

	/**
	 * Visit the marks list.
	 */
	void visitMarksList(MarksList marksList);

	/**
	 * Visit the date-wise attendance report.
	 */
	void visitDateWiseAttendanceReport(DateWiseAttendanceReport report);

	/**
	 * Visit the subject-wise attendance report
	 */
	void visitSubjectWiseAttendanceReport(SubjectWiseAttendanceReport report);
}
