package Repl;

import Calculator.CalculatorCore;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserRepl {
	private CalculatorCore calcCore;
	private ExpressionParser parser;
	private InputStream inputStream;
	private PrintStream printStream;


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
		boolean running = true;
		while (running) {
			input = scanner.nextLine();

			if (input.toLowerCase().equals("exit")) {
				printStream.println("Exit.");
				running = false;
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
					printStream.println(calcCore.divide(a, b));
					break;
			}

			printStream.println();
		}
	}
}
