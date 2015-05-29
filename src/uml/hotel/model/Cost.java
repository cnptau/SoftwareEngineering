package uml.hotel.model;

/**
 * Cost entity. @author MyEclipse Persistence Tools
 */

public class Cost implements java.io.Serializable {

	// Fields

	private Integer id;
	private String roomId;
	private String serviceName;
	private String servicePrice;
	private String numb;
	private String cost;

	// Constructors

	/** default constructor */
	public Cost() {
	}

	/** minimal constructor */
	public Cost(String roomId) {
		this.roomId = roomId;
	}

	/** full constructor */
	public Cost(String roomId, String serviceName, String servicePrice,
			String numb, String cost) {
		this.roomId = roomId;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.numb = numb;
		this.cost = cost;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getNumb() {
		return this.numb;
	}

	public void setNumb(String numb) {
		this.numb = numb;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}