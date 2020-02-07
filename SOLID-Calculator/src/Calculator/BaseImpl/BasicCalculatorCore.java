package Calculator.BaseImpl;

import Calculator.BinaryOperation;
import Calculator.CalculatorCore;

/**
 * Basic implementation of calculator core.
 *
 * @see CalculatorCore
 */
public class BasicCalculatorCore implements CalculatorCore {
	// Operations
	private final BinaryOperation summator, subtractor, multiplier, divisor;

	/**
	 * Creates the BasicCalculatorCore
	 * with provided operations.
	 *
	 * @param summator   Summation operation.
	 * @param subtractor Subtraction operation.
	 * @param multiplier Multiplication operation.
	 * @param divisor    Division operation.
	 */
	public BasicCalculatorCore(BinaryOperation summator, BinaryOperation subtractor, BinaryOperation multiplier, BinaryOperation divisor) {
		this.summator = summator;
		this.subtractor = subtractor;
		this.multiplier = multiplier;
		this.divisor = divisor;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public double add(double a, double b) {
		return summator.apply(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double subtract(double a, double b) {
		return subtractor.apply(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double multiply(double a, double b) {
		return multiplier.apply(a, b);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double divide(double a, double b) {
		return divisor.apply(a, b);
	}
}
