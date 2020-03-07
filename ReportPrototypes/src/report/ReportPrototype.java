package report;

/**
 * Prototype for reports.
 */
public interface ReportPrototype {
	/**
	 * Clone the report.
	 *
	 * @return Cloned report.
	 * @throws CloneNotSupportedException If cloning not supported.
	 */
	ReportPrototype clone() throws CloneNotSupportedException;

	/**
	 * Print the report.
	 */
	void print();
}
