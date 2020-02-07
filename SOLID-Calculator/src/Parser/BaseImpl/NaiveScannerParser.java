package Parser.BaseImpl;

import Parser.ExpressionParser;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Naive scanner-based parser.
 * Actually doesn't work.
 *
 * @see ExpressionParser
 */
public class NaiveScannerParser implements ExpressionParser {
	private String input;
	private double aVal, bVal;
	private char operator;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * {@inheritDoc}
	 */
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getA() {
		return aVal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getB() {
		return bVal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public char getOperator() {
		return operator;
	}
}
