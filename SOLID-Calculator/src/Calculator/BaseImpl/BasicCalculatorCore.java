package Calculator.BaseImpl;

import Calculator.CalculatorCore;
import Calculator.Operation;

public class BasicCalculatorCore implements CalculatorCore {
	private final Operation summator, subtractor, multiplier, divisor;

	public BasicCalculatorCore(Operation summator, Operation subtractor, Operation multiplier, Operation divisor) {
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
