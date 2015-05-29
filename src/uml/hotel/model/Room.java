package uml.hotel.model;



/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String roomId;
     private Integer price;
     private String description;


    // Constructors

    /** default constructor */
    public Room() {
    }

    
    /** full constructor */
    public Room(String roomId, Integer price, String description) {
        this.roomId = roomId;
        this.price = price;
        this.description = description;
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

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
   








}