package Calculator.BaseImpl;

import Calculator.BinaryOperation;

public class Summator implements BinaryOperation {
	@Override
	public double apply(double a, double b) {
		return a + b;
	}
}
