package Calculator.BaseImpl;

import Calculator.BinaryOperation;
import Calculator.CalculatorCore;

public class BasicCalculatorCore implements CalculatorCore {
	private final BinaryOperation summator, subtractor, multiplier, divisor;

	public BasicCalculatorCore(BinaryOperation summator, BinaryOperation subtractor, BinaryOperation multiplier, BinaryOperation divisor) {
		this.summator = summator;
		this.subtractor = subtractor;
		this.multiplier = multiplier;
		this.divisor = divisor;
	}


	@Override
	public double add(double a, double b) {
		return summator.apply(a, b);
	}

	@Override
	public double subtract(double a, double b) {
		return subtractor.apply(a, b);
	}

	@Override
	public double multiply(double a, double b) {
		return multiplier.apply(a, b);
	}

	@Override
	public double divide(double a, double b) {
		return divisor.apply(a, b);
	}
}
