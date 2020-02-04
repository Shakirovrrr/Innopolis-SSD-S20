import Calculator.BaseImpl.*;
import Calculator.CalculatorCore;
import Repl.ExpressionParser;
import Repl.FSAParser;
import Repl.UserRepl;

public class Main {
	public static void main(String[] args) {
		CalculatorCore calc = new BasicCalculatorCore(new Summator(),
				new Subtractor(), new Multiplier(), new Divisor());
		ExpressionParser parser = new FSAParser();

		UserRepl repl = new UserRepl(calc, parser);
		repl.run();
	}
}
