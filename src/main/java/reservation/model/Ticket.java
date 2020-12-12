package reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

    @Id
    private String id;
    private String flyID;
    private String userid = null;
    private int place;

    public Ticket(String ID, String flyID, int place){
        this.id = ID;
        this.flyID = flyID;
        this.place = place;
    }

    public Ticket() {

    }


    public String getId() {
        return id;
    }

    public String getFlyID() {
        return flyID;
    }

    public void setUserid(String ID){
        userid = ID;
    }

    public String getUserid() {
        return userid;
    }

    public int getPlace() {
        return place;
    }
}