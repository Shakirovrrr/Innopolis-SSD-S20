import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Database with records.
 */
public class Database {
	/**
	 * Initialize the database connection.
	 */
	void connect() {

	}

	/**
	 * Close the database collection.
	 */
	void disconnect() {

	}

	/**
	 * Get the student marks.
	 *
	 * @param studentID Student's ID.
	 * @return Map with mark lists for each student.
	 */
	Map<String, List<Character>> getStudentMarks(String studentID) {
		return null;
	}

	/**
	 * Get student's attendance for specified subject.
	 *
	 * @param studentID Student's ID.
	 * @param subject   Subject name.
	 * @return List of dates student attended the subject.
	 */
	List<Date> getStudentAttendance(String studentID, String subject) {
		return null;
	}

	/**
	 * Get attendance for specified subject.
	 *
	 * @param subject Subject name.
	 * @param date    Date to get attendance.
	 * @return List with student IDs who attended the subject on a specified day.
	 */
	List<String> getSubjectAttendance(String subject, Date date) {
		return null;
	}

	/**
	 * Get list of defaulters.
	 *
	 * @return List of defaulters student IDs.
	 */
	List<String> getDefaulters() {
		return null;
	}
}
