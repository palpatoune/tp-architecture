package reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Hashtable;

@Entity
public class Vol {

    @Id
    private String id;
    private static Hashtable<String, Vol> vols = new Hashtable<>();
    private String airportDepID;
    private String airportArrID;
    private float price;
    private int seatCap;
    private static Hashtable<Integer, Ticket> places;

    public Vol (String ID, String AirportDepID, String AirportArrID, float price, int SeatMax){
        this.id = ID;
        this.airportArrID = AirportArrID;
        this.airportDepID = AirportDepID;
        this.price = price;
        this.seatCap = SeatMax;
        places = new Hashtable<>(seatCap);
        // Génerer les tickets pour les places
    }

    public Vol() {

    }

    private static void addVol(Vol vol){
        vols.put(vol.id,vol);
    }

    private static Vol getVol(String ID){
        return vols.get(ID);
    }

    public boolean BookPlace(int place, String User){
        if(places.get(place).getUserid() == null) {
            places.get(place).setUserid(User);
            return true;
        }
        return false;
    }

    public Hashtable<Integer, Ticket> getPlaces() {
        return places;
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

    public void setPrice(float price) {
        this.price = price;
    }

}