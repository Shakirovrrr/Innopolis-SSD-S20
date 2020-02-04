package Repl;

import Calculator.CalculatorCore;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserRepl {
	private final CalculatorCore calcCore;
	private final ExpressionParser parser;
	private final InputStream inputStream;
	private final PrintStream printStream;


	public UserRepl(CalculatorCore calcCore, ExpressionParser parser) {
		this(calcCore, parser, System.in, System.out);
	}

	public UserRepl(CalculatorCore calcCore, ExpressionParser parser, InputStream inputStream, PrintStream printStream) {
		this.calcCore = calcCore;
		this.parser = parser;
		this.inputStream = inputStream;
		this.printStream = printStream;
	}

	public void run() {
		String input;
		Scanner scanner = new Scanner(inputStream);
		boolean parsingSucceeded;
		char operator;
		double a, b;
		while (true) {
			input = scanner.nextLine();

			if (input.toLowerCase().equals("exit")) {
				printStream.println("Exit.");
				break;
			}

			parser.setInput(input);
			parsingSucceeded = parser.parse();
			if (!parsingSucceeded) {
				printStream.println("Invalid input.\n");
				continue;
			}

			a = parser.getA();
			b = parser.getB();
			operator = parser.getOperator();

			switch (operator) {
				case '+':
					printStream.println(calcCore.add(a, b));
					break;
				case '-':
					printStream.println(calcCore.subtract(a, b));
					break;
				case '*':
					printStream.println(calcCore.multiply(a, b));
					break;
				case '/':
					if (Double.compare(b, 0) == 0) {
						printStream.println("Division by zero is not allowed.");
						break;
					}
					printStream.println(calcCore.divide(a, b));
					break;
			}

			printStream.println();
		}
	}
}
