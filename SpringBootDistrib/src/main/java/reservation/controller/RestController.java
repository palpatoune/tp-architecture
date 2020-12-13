package reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import reservation.data.AirportDAO;
import reservation.data.ReservationDAO;
import reservation.data.UserDAO;
import reservation.data.VolDAO;
import reservation.model.Airport;
import reservation.model.Reservation;
import reservation.model.User;
import reservation.model.Vol;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RestController {

    private static List<Airport> airportList = new ArrayList<>();
    private static List<Vol> volList = new ArrayList<>();
    private static List<User> userList = new ArrayList<>();
    private static List<Reservation> reservationList = new ArrayList<>();

    @Autowired
    private AirportDAO airportDAO;

    @Autowired
    private VolDAO volDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ReservationDAO reservationDAO;

    public static void start()
    {
        User toto = new User("toto", "0389209293", "toto@gmail.com" );
        Airport dtw = new Airport( "DTW","Detroit");
        Airport cdg = new Airport("CDG","CDG Paris" );
        Airport jfk = new Airport("JFK","New York" );
        Vol vol1 = new Vol(  dtw.getId(), cdg.getId(), 1400 );
        Vol vol2 = new Vol(  dtw.getId(), jfk.getId(), 500 );
        Vol vol3 = new Vol( cdg.getId(), jfk.getId(), 900 );
        Vol vol4 = new Vol(  cdg.getId(), dtw.getId(), 1600 );
        Vol vol5 = new Vol(  jfk.getId(), cdg.getId(), 600 );
        Vol vol6 = new Vol(  jfk.getId(), dtw.getId(), 200);
        userList.add(toto);
        airportList.add(dtw);
        airportList.add(cdg);
        airportList.add(jfk);
        volList.add(vol1);
        volList.add(vol2);
        volList.add(vol3);
        volList.add(vol4);
        volList.add(vol5);
        volList.add(vol6);
        Reservation reservation1 = new Reservation(toto.getId(), vol1.getID());
        Reservation reservation2 = new Reservation(toto.getId(), vol2.getID());
        Reservation reservation3 = new Reservation(toto.getId(), vol3.getID());
        Reservation reservation4 = new Reservation(toto.getId(), vol4.getID());
        Reservation reservation5 = new Reservation(toto.getId(), vol5.getID());
        Reservation reservation6 = new Reservation(toto.getId(), vol6.getID());
        reservationList.add(reservation1);
        reservationList.add(reservation2);
        reservationList.add(reservation3);
        reservationList.add(reservation4);
        reservationList.add(reservation5);
        reservationList.add(reservation6);
    }

    @PostMapping("/user")
    public String createUser(@ModelAttribute User user){
        userDAO.save(user);
        return "redirect:user";
    }

    @GetMapping("/user")
    public String showUser(Model model)  {
        userList = userDAO.findAll();
        model.addAttribute("newUser",new User());
        model.addAttribute("usList",userList);
        return "ClientPage";
    }

    @GetMapping("/airports")
    public String showAirport(Model model){
        airportList = airportDAO.findAll();
        model.addAttribute("newAirPort",new Airport());
        model.addAttribute("airportList",airportList);
        return "AirportPage";
    }

    @PostMapping("/airports")
    public String createAirport(@ModelAttribute Airport airport){
        airportDAO.save(airport);
        return "redirect:airports";
    }

    @GetMapping("/vols")
    public String showVols(Model model){
        volList = volDAO.findAll();
        model.addAttribute("newVol",new Vol());
        model.addAttribute("volList",volList);
        return "VolPage";
    }

    @PostMapping("/vols")
    public String createVols(@ModelAttribute Vol vol){
        volDAO.save(vol);
        return "redirect:vols";
    }

    @GetMapping("/reservations")
    public String showReservations(Model model){
        reservationList = reservationDAO.findAll();
        model.addAttribute("newReservation",new Reservation());
        model.addAttribute("reservationList",reservationList);
        return "ReservationPage";
    }

    @PostMapping("/reservations")
    public String createReservation(@ModelAttribute Reservation reservation){
        reservationDAO.save(reservation);
        return "redirect:reservation";
    }

    @GetMapping("/")
    public String init(Model model){
        for(int i = 0; i < volList.size();i++){
            volDAO.save(volList.get(i));
        }

        for(int i = 0; i < airportList.size();i++){
            airportDAO.save(airportList.get(i));
        }

        for(int i = 0; i < userList.size();i++){
            userDAO.save(userList.get(i));
        }

        for(int i = 0; i < reservationList.size();i++){
            reservationDAO.save(reservationList.get(i));
        }

        return "redirect:vols";
    }

}
