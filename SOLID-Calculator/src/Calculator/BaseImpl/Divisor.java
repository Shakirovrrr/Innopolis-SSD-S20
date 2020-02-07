package Calculator.BaseImpl;

import Calculator.BinaryOperation;

/**
 * Division implementation.
 *
 * @see BinaryOperation
 */
public class Divisor implements BinaryOperation {
	/**
	 * Divides two numbers. (a / b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Division of two numbers.
	 */
	@Override
	public double apply(double a, double b) throws ArithmeticException {
		return a / b;
	}
}
