package Parser;

public interface ExpressionParser {
	void setInput(String input);

	boolean parse();

	double getA();

	double getB();

	char getOperator();
}
