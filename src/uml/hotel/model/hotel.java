package uml.hotel.model;

/**
 * hotel entity. @author MyEclipse Persistence Tools
 */
public class hotel extends Abstracthotel implements
		java.io.Serializable {

	// Constructors

	/** default constructor 
	 * @return */
//	public hotel() {
//	}

	/** full constructor */
	public hotel(String name, String password) {
		super(name, password);
	}

}
