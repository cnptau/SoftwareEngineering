package uml.hotel.model;

/**
 * Service entity. @author MyEclipse Persistence Tools
 */

public class Service implements java.io.Serializable {

	// Fields

	private Integer id;
	private String serId;
	private String serName;
	private String serPrice;
	private String serStcok;

	// Constructors

	/** default constructor */
	public Service() {
	}

	/** full constructor */
	public Service(String serId, String serName, String serPrice,
			String serStcok) {
		this.serId = serId;
		this.serName = serName;
		this.serPrice = serPrice;
		this.serStcok = serStcok;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerId() {
		return this.serId;
	}

	public void setSerId(String serId) {
		this.serId = serId;
	}

	public String getSerName() {
		return this.serName;
	}

	public void setSerName(String serName) {
		this.serName = serName;
	}

	public String getSerPrice() {
		return this.serPrice;
	}

	public void setSerPrice(String serPrice) {
		this.serPrice = serPrice;
	}

	public String getSerStcok() {
		return this.serStcok;
	}

	public void setSerStcok(String serStcok) {
		this.serStcok = serStcok;
	}

}