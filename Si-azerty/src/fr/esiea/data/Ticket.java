package fr.esiea.data;

public class Ticket {

    private final String ID;
    private final String flyID;
    private String UserID = null;
    private final int place;
    
    public Ticket(String ID, String flyID, int place){
        this.ID = ID;
        this.flyID = flyID;
        this.place = place;
    }
    
    
    public String getID() {
        return ID;
    }
    
    public String getFlyID() {
        return flyID;
    }
    
    public void setUserID(String ID){
        UserID = ID;
    }
    
    public String getUserID() {
        return UserID;
    }
    
    public int getPlace() {
        return place;
    }
}
