package uml.hotel.model;

/**
 * Abstracthotel entity provides the base persistence definition of the
 * hotel entity. @author MyEclipse Persistence Tools
 */

public abstract class Abstracthotel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;

	// Constructors

	/** default constructor */
	public Abstracthotel() {
	}

	/** full constructor */
	public Abstracthotel(String name, String password) {
		this.name = name;
		this.password = password;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}