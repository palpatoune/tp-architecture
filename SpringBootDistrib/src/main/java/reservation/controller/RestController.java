package reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        toto.reserveVol(vol1);
        toto.reserveVol(vol3);
        toto.reserveVol(vol6);
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
        userList.add(user);
        return "redirect:user";
    }

    @GetMapping("/user")
    public String showTest(Model model)  {
        model.addAttribute("newUser",new User());
        model.addAttribute("usList",userList);
        return "ClientPage";
    }

}
