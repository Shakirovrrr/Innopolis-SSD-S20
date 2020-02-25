package report;

import java.util.Date;

public interface AttendanceReport extends Report {
	void addAttended(String subject, Date date);
}
