package reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Hashtable;

@Entity
public class Airport {

    @Id
    private String id;
    private String name;
    private static Hashtable<String, Airport> airports = new Hashtable<>();

    public Airport(String id, String name) {
        this.id = id;
        this.name = name;
        airports.put(this.id, this);
    }

    public Airport() {

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}