package Calculator;

/**
 * Interface describes binary
 * arithmetic operations.
 */
public interface BinaryOperation {
	/**
	 * Applies the operation to two double numbers.
	 *
	 * @param a First (left) number.
	 * @param b Second (right) number.
	 * @return Operation result.
	 */
	double apply(double a, double b);
}
