package college;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * College database connector.
 */
public class Database {
	/**
	 * Connect to the database.
	 */
	public void connect() {

	}

	/**
	 * Disconnect from the database.
	 */
	public void disconnect() {

	}

	/**
	 * Get student marks.
	 *
	 * @param studentName Student name.
	 * @return Student marks by subject.
	 */
	public Map<String, List<Character>> getStudentMarks(String studentName) {
		return null;
	}

	/**
	 * Get student attendance by subject.
	 *
	 * @param studentName Student name.
	 * @param subject     Subject.
	 * @return List of dates student attended the classes.
	 */
	public List<Date> getStudentAttendance(String studentName, String subject) {
		return null;
	}

	/**
	 * Get students attended the class.
	 *
	 * @param subject Subject name.
	 * @return Students attended the class.
	 */
	public List<String> getSubjectAttendance(String subject) {
		return null;
	}

	/**
	 * Get the defaulters list.
	 *
	 * @return List of defaulters.
	 */
	public List<String> getDefaulters() {
		return null;
	}
}
