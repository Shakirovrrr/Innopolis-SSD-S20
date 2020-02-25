/**
 * Student identification data.
 */
public class Student {
	private String studentId;
	private String name;

	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	/**
	 * Get student ID.
	 *
	 * @return Student ID
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * Get student name.
	 *
	 * @return Student name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set student name.
	 *
	 * @param name Student name.
	 */
	public void setName(String name) {
		this.name = name;
	}
}
