package Repl;

import java.util.LinkedList;
import java.util.List;

public class FSAParser implements ExpressionParser {
	private String input;
	private int inputPos;
	private double aVal, bVal;
	private char operator;

	@Override
	public void setInput(String input) {
		this.inputPos = 0;
		this.input = input;
	}

	@Override
	public boolean parse() {
		byte state = 0, prevState = 0;
		StringBuilder buffer = new StringBuilder();
		List<String> tokens = new LinkedList<>();

		input = input.strip();
		for (char read : input.toCharArray()) {
			//noinspection ConstantConditions
			do {
				if (Character.isDigit(read)) {
					state = 1;
					if (prevState != 1 && prevState != 2) {
						flushTokenBuf(buffer, tokens);
					}

					buffer.append(read);

					break;
				}

				if (read == '.') {
					state = 2;
					if (prevState != 1) {
						return false;
					}

					buffer.append(read);

					break;
				}

				if (read == '+' || read == '-' || read == '*' || read == '/') {
					state = 3;
					if (prevState != 0 && prevState != 1) {
						return false;
					}

					flushTokenBuf(buffer, tokens);
					tokens.add(String.valueOf(read));
				}
			} while (false);

			prevState = state;
		}
		flushTokenBuf(buffer, tokens);

		if (tokens.size() != 3) {
			if (!(tokens.get(0).equals("-") && tokens.size() == 4)) {
				return false;
			} else {
				tokens.set(1, "-" + tokens.get(1));
				tokens.remove(0);
			}
		}

		try {
			aVal = Double.parseDouble(tokens.get(0));
			bVal = Double.parseDouble(tokens.get(2));
			operator = tokens.get(1).charAt(0);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

	private void flushTokenBuf(StringBuilder buffer, List<String> tokens) {
		if (buffer.length() > 0) {
			tokens.add(buffer.toString());
			buffer.setLength(0);
		}
	}

	private byte nextByte() {
		return input.getBytes()[inputPos++];
	}

	@Override
	public double getA() {
		return aVal;
	}

	@Override
	public double getB() {
		return bVal;
	}

	@Override
	public char getOperator() {
		return operator;
	}
}
