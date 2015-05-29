package uml.hotel.model;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String customerId;
	private String name;
	private String callNumber;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	/** full constructor */
	public Customer(String customerId, String name, String callNumber) {
		this.customerId = customerId;
		this.name = name;
		this.callNumber = callNumber;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallNumber() {
		return this.callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

}