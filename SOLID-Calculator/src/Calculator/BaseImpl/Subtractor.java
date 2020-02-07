package Calculator.BaseImpl;

import Calculator.BinaryOperation;

/**
 * Subtraction implementation.
 *
 * @see BinaryOperation
 */
public class Subtractor implements BinaryOperation {
	/**
	 * Subtracts two numbers. (a - b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Subtraction of two numbers.
	 */
	@Override
	public double apply(double a, double b) {
		return a - b;
	}
}
