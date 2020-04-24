import college.report.impl.AttendanceReport;
import college.report.impl.DateWiseAttendanceReport;
import college.report.utils.PDFExportVisitor;
import college.report.utils.Visitor;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		AttendanceReport report = new DateWiseAttendanceReport();
		report.addAttended("Calculus", new Date());
		// Fill the report...

		Visitor pdfExport = new PDFExportVisitor();
		report.acceptVisitor(pdfExport);
	}
}
