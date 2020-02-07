import Calculator.BaseImpl.*;
import Calculator.CalculatorCore;
import Parser.BaseImpl.FSAParser;
import Parser.ExpressionParser;

public class Main {
	public static void main(String[] args) {
		// Create basic calculator core
		// with provided operations
		CalculatorCore calc = new BasicCalculatorCore(new Summator(),
				new Subtractor(), new Multiplier(), new Divisor());
		ExpressionParser parser = new FSAParser(); // Create an expression parser

		// Create user REPL with provided calculator and expression parser
		UserRepl repl = new UserRepl(calc, parser);
		repl.run(); // Start REPL
	}
}
