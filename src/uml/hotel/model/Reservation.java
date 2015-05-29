package uml.hotel.model;



/**
 * Reservation entity. @author MyEclipse Persistence Tools
 */

public class Reservation  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String bookingId;
     private String name;
     private String callNumber;
     private String customerId;
     private String roomId;
     private String bookingTime;
     private String startTime;
     private String endTime;
     private String stayTime;


    // Constructors

    /** default constructor */
    public Reservation() {
    }

    
    /** full constructor */
    public Reservation(String bookingId, String name, String callNumber, String customerId, String roomId, String bookingTime, String startTime, String endTime, String stayTime) {
        this.bookingId = bookingId;
        this.name = name;
        this.callNumber = callNumber;
        this.customerId = customerId;
        this.roomId = roomId;
        this.bookingTime = bookingTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stayTime = stayTime;
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

    public String getCallNumber() {
        return this.callNumber;
    }
    
    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
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

    public String getBookingTime() {
        return this.bookingTime;
    }
    
    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
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

    public String getStayTime() {
        return this.stayTime;
    }
    
    public void setStayTime(String stayTime) {
        this.stayTime = stayTime;
    }
   








}