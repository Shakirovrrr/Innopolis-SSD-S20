package Calculator.BaseImpl;

import Calculator.Operation;

public class Subtractor implements Operation {
	@Override
	public double apply(double a, double b) {
		return a - b;
	}
}