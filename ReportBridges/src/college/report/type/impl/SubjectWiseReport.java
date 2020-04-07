package college.report.type.impl;

import college.report.type.ReportType;

/**
 * Subject-wise report.
 */
public class SubjectWiseReport implements ReportType {
	private String subjectName;

	/**
	 * Get the report subject name.
	 *
	 * @return Subject name.
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * Set the report subject name.
	 *
	 * @param subjectName Subject name.
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getReportType() {
		return null;
	}
}
