package Calculator.BaseImpl;

import Calculator.BinaryOperation;

public class Subtractor implements BinaryOperation {
	@Override
	public double apply(double a, double b) {
		return a - b;
	}
}
