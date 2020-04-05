package college.report.type.impl;

import college.report.type.ReportType;

public class SubjectWiseReport implements ReportType {
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String getReportType() {
		return null;
	}
}
