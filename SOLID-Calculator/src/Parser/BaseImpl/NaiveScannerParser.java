package Parser.BaseImpl;

import Parser.ExpressionParser;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NaiveScannerParser implements ExpressionParser {
	private String input;
	private double aVal, bVal;
	private char operator;

	@Override
	public void setInput(String input) {
		this.input = input;
	}

	@Override
	public boolean parse() {
		try (Scanner scanner = new Scanner(input)) {
			aVal = scanner.nextDouble();

			operator = scanner.findInLine(".").charAt(0);
			if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
				return false;
			}

			bVal = scanner.nextDouble();
		} catch (NoSuchElementException e) {
			return false;
		}

		return true;
	}

	@Override
	public double getA() {
		return aVal;
	}

	@Override
	public double getB() {
		return bVal;
	}

	@Override
	public char getOperator() {
		return operator;
	}
}
