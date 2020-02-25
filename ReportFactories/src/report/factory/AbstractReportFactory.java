package report.factory;

import report.Report;

public interface AbstractReportFactory {
	Report makeReport(String studentID);
}
