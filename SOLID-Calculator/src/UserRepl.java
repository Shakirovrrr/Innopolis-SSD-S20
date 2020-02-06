import Calculator.CalculatorCore;
import Parser.ExpressionParser;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UserRepl {
	private final CalculatorCore calcCore;
	private final ExpressionParser parser;
	private final InputStream inputStream;
	private final PrintStream printStream;
	private final Queue<String> history;

	public UserRepl(CalculatorCore calcCore, ExpressionParser parser) {
		this(calcCore, parser, System.in, System.out);
	}

	public UserRepl(CalculatorCore calcCore, ExpressionParser parser, InputStream inputStream, PrintStream printStream) {
		this.calcCore = calcCore;
		this.parser = parser;
		this.inputStream = inputStream;
		this.printStream = printStream;
		this.history = new LinkedList<>();
	}

	public void run() {
		String input;
		Scanner scanner = new Scanner(inputStream);
		boolean parsingSucceeded;
		char operator;
		double a, b;
		StringBuilder stringBuilder = new StringBuilder();
		double result;

		printStream.println("hist - show history.\nexit - exit.\n+, -, *, / are allowed.\n");

		while (true) {
			input = scanner.nextLine().strip();
			if (input.length() == 0) {
				continue;
			}

			if (input.toLowerCase().equals("exit")) {
				printStream.println("Exit.");
				break;
			}

			if (input.toLowerCase().equals("hist")) {
				if (history.isEmpty()) {
					printStream.println("No items in history.\n");
					continue;
				}
				for (String s : history) {
					printStream.println(s);
				}
				printStream.println();
				continue;
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
					result = calcCore.add(a, b);
					break;
				case '-':
					result = calcCore.subtract(a, b);
					break;
				case '*':
					result = calcCore.multiply(a, b);
					break;
				case '/':
					if (Double.compare(b, 0) == 0) {
						printStream.println("Division by zero is not allowed.\n");
						continue;
					}
					result = calcCore.divide(a, b);
					break;
				default:
					continue;
			}

			printStream.println(result);

			stringBuilder.append(a).append(' ').append(operator).append(' ').append(b).append(" = ").append(result);
			history.add(stringBuilder.toString());
			stringBuilder.setLength(0);
			if (history.size() > 5) {
				history.poll();
			}

			printStream.println();
		}
	}
}
