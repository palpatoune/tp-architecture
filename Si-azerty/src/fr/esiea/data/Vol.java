package fr.esiea.data;

import java.util.Hashtable;

public class Vol {
    
    private static Hashtable<String, Vol> Vols = new Hashtable<>();
    
    private final String ID;
    private final String AirportDepID;
    private String AirportArrID;
    private float price;
    private int SeatCap;
    private Hashtable<Integer, Ticket> places;
    
    public Vol (String ID, String AirportDepID, String AirportArrID, float price, int SeatMax){
        this.ID = ID;
        this.AirportArrID = AirportArrID;
        this.AirportDepID = AirportDepID;
        this.price = price;
        this.SeatCap = SeatMax;
        places = new Hashtable<>(SeatCap);
        // Génerer les tickets pour les places
    }
    
    private static void addVol(Vol vol){
        Vols.put(vol.ID,vol);
    }
    
    private static Vol getVol(String ID){
        return Vols.get(ID);
    }
    
    public boolean BookPlace(int place, String User){
        if(places.get(place).getUserID() == null) {
            places.get(place).setUserID(User);
            return true;
        }
        return false;
    }
    
    public Hashtable<Integer, Ticket> getPlaces() {
        return places;
    }
    
    public String getID() {
        return ID;
    }
    
    public String getAirportDepID() {
        return AirportDepID;
    }
    
    public String getAirportArrID() {
        return AirportArrID;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
}
