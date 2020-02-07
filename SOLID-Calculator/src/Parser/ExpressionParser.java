package Parser;

/**
 * Interface for simple expression parser.
 */
public interface ExpressionParser {
	/**
	 * Sets input expression for parsing.
	 *
	 * @param input Input expressions.
	 */
	void setInput(String input);

	/**
	 * Parse provided input.
	 *
	 * @return {@code true} if parsing was successful, {@code false} otherwise.
	 */
	boolean parse();

	/**
	 * Get first (left) expression number.
	 *
	 * @return First (left) number.
	 */
	double getA();

	/**
	 * Get second (right) expression number.
	 *
	 * @return Second (right) number.
	 */
	double getB();

	/**
	 * Get the expression operator.
	 *
	 * @return The expression operator.
	 */
	char getOperator();
}
