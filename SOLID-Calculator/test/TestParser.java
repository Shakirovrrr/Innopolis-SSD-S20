import Parser.BaseImpl.FSAParser;
import Parser.ExpressionParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestParser {
	private static ExpressionParser parser;

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

	@Test
	void test2() {
		boolean result;
		parser.setInput("3-4");
		result = parser.parse();

		Assertions.assertTrue(result);
		assertValues(3, '-', 4);
	}

	@Test
	void test3() {
		boolean result;
		parser.setInput(" -5.227 *    36.6  ");
		result = parser.parse();

		Assertions.assertTrue(result);
		assertValues(-5.227, '*', 36.6);
	}

	@Test
	void test4() {
		boolean result;
		parser.setInput("10 / 0");
		result = parser.parse();

		Assertions.assertTrue(result);
		assertValues(10, '/', 0);
	}

	@Test
	void test5() {
		boolean result;
		parser.setInput("79yhuiweo");
		result = parser.parse();

		Assertions.assertFalse(result);
	}

	@Test
	void test6() {
		boolean result;
		parser.setInput("64..5+ 100");
		result = parser.parse();

		Assertions.assertFalse(result);
	}

	@Test
	void test7() {
		boolean result;
		parser.setInput("25.3 - 100.");
		result = parser.parse();

		Assertions.assertTrue(result);
		assertValues(25.3, '-', 100.);
	}
}
