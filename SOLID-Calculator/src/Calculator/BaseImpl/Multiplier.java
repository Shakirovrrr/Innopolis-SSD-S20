package Calculator.BaseImpl;

import Calculator.BinaryOperation;

/**
 * Multiplication implementation.
 *
 * @see BinaryOperation
 */
public class Multiplier implements BinaryOperation {
	/**
	 * Multiplies two numbers. (a * b)
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Multiplication of two numbers.
	 */
	@Override
	public double apply(double a, double b) {
		return a * b;
	}
}
