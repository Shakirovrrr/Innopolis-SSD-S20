package Calculator;

/**
 * Interface describes the calculator core
 * which applies various operations on
 * double-precision real numbers.
 */
public interface CalculatorCore {
	/**
	 * Adds two numbers. (a + b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Sum of two numbers.
	 */
	double add(double a, double b);

	/**
	 * Subtracts two numbers. (a - b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Subtraction of two numbers.
	 */
	double subtract(double a, double b);

	/**
	 * Multiplies two numbers. (a * b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Multiplication of two numbers.
	 */
	double multiply(double a, double b);

	/**
	 * Divides two numbers. (a / b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Division of two numbers.
	 */
	double divide(double a, double b);
}
