package model;

/**
 * Currencydb entity. @author MyEclipse Persistence Tools
 */
public class Currencydb extends AbstractCurrencydb implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Currencydb() {
	}

	/** full constructor */
	public Currencydb(String currency, String exchangeRate) {
		super(currency, exchangeRate);
	}

}
