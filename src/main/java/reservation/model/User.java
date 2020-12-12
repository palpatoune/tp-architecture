package reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private static Hashtable<Integer, User> users = new Hashtable<>();
    private String name;
    private String phone;
    private String mail;
    private static ArrayList<Ticket> tickets = new ArrayList<>();

    public User(int id, String name, String phone, String mail) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        users.put(this.id, this);
    }

    public User() {

    }

    public static User getUser(String ID){
        return users.get(ID);
    }

    public static Hashtable<Integer, User> getUsers(){
        return users;
    }

    public static void delUser(String ID){
        users.remove(ID);
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public List<Ticket> getTickets(){
        return tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() { return id;   }

    public void setId(int id) {
        this.id = id;
    }

    public static void setUsers(Hashtable<Integer, User> users) {
        User.users = users;
    }

    public static void setTickets(ArrayList<Ticket> tickets) {
        User.tickets = tickets;
    }
}