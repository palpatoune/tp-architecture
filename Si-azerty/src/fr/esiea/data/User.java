package fr.esiea.data;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class User {
    
    private static Hashtable<String, User> Users = new Hashtable<>();
    
    private final String ID;
    private String Name;
    private String Phone;
    private String Mail;
    private ArrayList<Ticket> Tickets = new ArrayList<>();
    
    public User(String id, String name, String phone, String mail) {
        ID = id;
        Name = name;
        Phone = phone;
        Mail = mail;
        Users.put(ID, this);
    }
    
    public static User getUser(String ID){
        return Users.get(ID);
    }
    
    public static Hashtable<String, User> getUsers(){
        return Users;
    }
    
    public static void delUser(String ID){
        Users.remove(ID);
    }
    
    public void addTicket(Ticket ticket){
        Tickets.add(ticket);
    }
    
    public List<Ticket> getTickets(){
        return Tickets;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        Name = name;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setPhone(String phone) {
        Phone = phone;
    }
    
    public String getMail() {
        return Mail;
    }
    
    public void setMail(String mail) {
        Mail = mail;
    }
}
