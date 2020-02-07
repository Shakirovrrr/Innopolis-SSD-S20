package Calculator.BaseImpl;

import Calculator.BinaryOperation;

public class Divisor implements BinaryOperation {
	@Override
	public double apply(double a, double b) throws ArithmeticException {
		return a / b;
	}
}
