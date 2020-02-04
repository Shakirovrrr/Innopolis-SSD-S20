import Repl.FSAParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestParser {
	private static FSAParser parser;

	@BeforeAll
	static void initialize() {
		parser = new FSAParser();
	}

	private void assertValues(double a, char oper, double b) {
		Assertions.assertEquals(a, parser.getA());
		Assertions.assertEquals(b, parser.getB());
		Assertions.assertEquals(oper, parser.getOperator());
	}

	@Test
	void test1() {
		boolean result;
		parser.setInput("5.0+2.0");
		result = parser.parse();

		Assertions.assertTrue(result);
		assertValues(5.0, '+', 2.0);
	}


}
