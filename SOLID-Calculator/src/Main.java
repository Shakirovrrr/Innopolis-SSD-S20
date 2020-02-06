import Calculator.BaseImpl.*;
import Calculator.CalculatorCore;
import Parser.BaseImpl.FSAParser;
import Parser.ExpressionParser;

public class Main {
	public static void main(String[] args) {
		CalculatorCore calc = new BasicCalculatorCore(new Summator(),
				new Subtractor(), new Multiplier(), new Divisor());
		ExpressionParser parser = new FSAParser();

		UserRepl repl = new UserRepl(calc, parser);
		repl.run();
	}
}
