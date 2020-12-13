package reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import reservation.data.AirportDAO;
import reservation.data.UserDAO;
import reservation.data.VolDAO;
import reservation.model.Airport;
import reservation.model.User;
import reservation.model.Vol;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RestController {

    private static List<Airport> airportList = new ArrayList<>();
    private static List<Vol> volList = new ArrayList<>();
    private static List<User> userList = new ArrayList<>();

    @Autowired
    private AirportDAO airportDAO;

    @Autowired
    private VolDAO volDAO;

    @Autowired
    private UserDAO userDAO;

    public static void start()
    {
        User toto = new User(0, "toto", "0389209293", "toto@gmail.com" );
        Airport dtw = new Airport( "DTW","Detroit");
        Airport cdg = new Airport("CDG","CDG Paris" );
        Airport jfk = new Airport("JFK","New York" );
        Vol vol1 = new Vol( "0", dtw.getId(), cdg.getId(), 1400 );
        Vol vol2 = new Vol( "1", dtw.getId(), jfk.getId(), 500 );
        Vol vol3 = new Vol( "2", cdg.getId(), jfk.getId(), 900 );
        Vol vol4 = new Vol( "3", cdg.getId(), dtw.getId(), 1600 );
        Vol vol5 = new Vol( "4", jfk.getId(), cdg.getId(), 600 );
        Vol vol6 = new Vol( "5", jfk.getId(), dtw.getId(), 200);
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

        return "redirect:vols";
    }

}
