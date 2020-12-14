package reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Hashtable;

@Entity
public class Airport {

    @Id
    private String id;
    private String name;

    public Airport(String id, String name) {
        this.id = id;
        this.name = name;
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