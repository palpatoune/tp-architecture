package fr.esiea.data;

import java.util.Hashtable;

public class Airport {
    
    private static Hashtable<String, Airport> Airports = new Hashtable<>();
    
    private final String ID;
    private final String Name;
    
    public Airport(String id, String name) {
        ID = id;
        Name = name;
        Airports.put(this.ID, this);
    }
    
    public String getName() {
        return Name;
    }
    
    public String getID() {
        return ID;
    }
}
