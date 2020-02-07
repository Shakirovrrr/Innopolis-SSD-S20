import Calculator.BaseImpl.*;
import Calculator.CalculatorCore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalcCore {
	private static CalculatorCore calc;

	@BeforeAll
	private static void initialize() {
		calc = new BasicCalculatorCore(new Summator(),
				new Subtractor(), new Multiplier(), new Divisor());
	}

	@Test
	void test1() {
		Assertions.assertEquals(8 + 2, calc.add(8, 2));
	}

	@Test
	void test2() {
		Assertions.assertEquals(100 - 94, calc.subtract(100, 94));
	}

	@Test
	void test3() {
		Assertions.assertEquals(7 * 8, calc.multiply(7, 8));
	}

	@Test
	void test4() {
		Assertions.assertEquals(4.0 / 5.0, calc.divide(4, 5));
	}

	@Test
	void test5() {
		Assertions.assertEquals(Double.POSITIVE_INFINITY, calc.divide(10, 0));
	}

	@Test
	void test6() {
		Assertions.assertEquals(-2, calc.subtract(3, 5));
	}
}
