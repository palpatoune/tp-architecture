package reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Hashtable;

@Entity
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String airportDepID;
    private String airportArrID;
    private int price;

    public Vol (int ID, String AirportDepID, String AirportArrID, int price){
        this.id = ID;
        this.airportArrID = AirportArrID;
        this.airportDepID = AirportDepID;
        this.price = price;
    }

    public Vol ( String AirportDepID, String AirportArrID, int price){
        this.airportArrID = AirportArrID;
        this.airportDepID = AirportDepID;
        this.price = price;
    }

    public Vol() {

    }

    public int getID() {
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