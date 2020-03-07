package report;

import java.util.List;

/**
 * Defaulters list.
 *
 * @see ReportPrototype
 */
public class DefaultersList implements ReportPrototype {
	private List<String> defaulters;

	/**
	 * Create new defaulters list.
	 */
	public DefaultersList() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DefaultersList clone() throws CloneNotSupportedException {
		return (DefaultersList) super.clone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void print() {

	}
}
