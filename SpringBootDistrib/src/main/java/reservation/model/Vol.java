package reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Hashtable;

@Entity
public class Vol {

    @Id
    private String id;
    private String airportDepID;
    private String airportArrID;
    private int price;

    public Vol (String ID, String AirportDepID, String AirportArrID, int price){
        this.id = ID;
        this.airportArrID = AirportArrID;
        this.airportDepID = AirportDepID;
        this.price = price;
    }

    public Vol() {

    }

    public String getID() {
        return id;
    }

    public String getAirportDepID() {
        return airportDepID;
    }

    public String getAirportArrID() {
        return airportArrID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}