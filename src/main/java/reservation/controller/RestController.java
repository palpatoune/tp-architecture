package reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import reservation.data.AirportDAO;
import reservation.data.TicketDAO;
import reservation.data.UserDAO;
import reservation.data.VolDAO;
import reservation.model.Airport;
import reservation.model.Ticket;
import reservation.model.User;
import reservation.model.Vol;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RestController {

    private List<Airport> airportList = new ArrayList<>();
    private List<Vol> volList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();

    @Autowired
    UserDAO userDAO;

    @Autowired
    AirportDAO airportDAO;

    @Autowired
    VolDAO volDAO;

    @Autowired
    TicketDAO ticketDAO;

    @PostMapping("/user")
    public String createUser(@ModelAttribute User user){
        userDAO.save(user);
        return "redirect:user";
    }

    @GetMapping("/user")
    public String showTest(Model model)  {
        userList = userDAO.findAll();
        model.addAttribute("newUser",new User());
        model.addAttribute("usList",userList);
        return "ClientPage";
    }
}
