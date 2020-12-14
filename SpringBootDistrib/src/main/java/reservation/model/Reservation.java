package reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reservationID;
    private int userID;
    private int volID;

    public Reservation(int reservationID, int userID, int volID) {
        this.reservationID = reservationID;
        this.userID = userID;
        this.volID = volID;
    }

    public Reservation(int userID, int volID) {
        this.userID = userID;
        this.volID = volID;
    }

    public Reservation() {
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getVolID() {
        return volID;
    }

    public void setVolID(int volID) {
        this.volID = volID;
    }
}
