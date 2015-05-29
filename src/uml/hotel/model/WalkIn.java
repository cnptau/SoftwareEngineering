package uml.hotel.model;

/**
 * WalkIn entity. @author MyEclipse Persistence Tools
 */

public class WalkIn implements java.io.Serializable {

	// Fields

	private Integer id;
	private String bookingId;
	private String name;
	private String customerId;
	private String roomId;
	private String startTime;
	private String endTime;
	private Integer liveDate;

	// Constructors

	/** default constructor */
	public WalkIn() {
	}

	/** minimal constructor */
	public WalkIn(String bookingId, String customerId, String roomId,
			String startTime, String endTime, Integer liveDate) {
		this.bookingId = bookingId;
		this.customerId = customerId;
		this.roomId = roomId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.liveDate = liveDate;
	}

	/** full constructor */
	public WalkIn(String bookingId, String name, String customerId,
			String roomId, String startTime, String endTime, Integer liveDate) {
		this.bookingId = bookingId;
		this.name = name;
		this.customerId = customerId;
		this.roomId = roomId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.liveDate = liveDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getLiveDate() {
		return this.liveDate;
	}

	public void setLiveDate(Integer liveDate) {
		this.liveDate = liveDate;
	}

}