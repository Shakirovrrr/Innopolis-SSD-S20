package Calculator.BaseImpl;

import Calculator.BinaryOperation;

/**
 * Summation implementation.
 *
 * @see BinaryOperation
 */
public class Summator implements BinaryOperation {
	/**
	 * Adds two numbers. (a + b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Sum of two numbers.
	 */
	@Override
	public double apply(double a, double b) {
		return a + b;
	}
}
