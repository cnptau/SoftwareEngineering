package model;

/**
 * AbstractCurrencydb entity provides the base persistence definition of the
 * Currencydb entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCurrencydb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String currency;
	private String exchangeRate;

	// Constructors

	/** default constructor */
	public AbstractCurrencydb() {
	}

	/** full constructor */
	public AbstractCurrencydb(String currency, String exchangeRate) {
		this.currency = currency;
		this.exchangeRate = exchangeRate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}