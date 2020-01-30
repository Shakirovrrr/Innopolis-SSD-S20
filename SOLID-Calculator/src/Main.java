public class Main {
	public static void main(String[] args) {
		CalculatorCore calc = new BasicCalculatorCore(new Summator(),
				new Subtractor(), new Multiplier(), new Divisor());

		System.out.println(calc.add(3, 4));
	}
}
