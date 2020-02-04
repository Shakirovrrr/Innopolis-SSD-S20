package Calculator.BaseImpl;

import Calculator.Operation;

public class Divisor implements Operation {
	@Override
	public double apply(double a, double b) throws ArithmeticException {
		return a / b;
	}
}
