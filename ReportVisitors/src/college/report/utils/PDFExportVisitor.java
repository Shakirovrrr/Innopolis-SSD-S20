package college.report.utils;

import college.report.impl.DateWiseAttendanceReport;
import college.report.impl.DefaultersList;
import college.report.impl.MarksList;
import college.report.impl.SubjectWiseAttendanceReport;

public class PDFExportVisitor implements Visitor {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visitDefaultersList(DefaultersList defaultersList) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visitMarksList(MarksList marksList) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visitDateWiseAttendanceReport(DateWiseAttendanceReport report) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visitSubjectWiseAttendanceReport(SubjectWiseAttendanceReport report) {

	}
}
