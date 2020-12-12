package reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reservation.controller.RestController;

@SpringBootApplication
public class RestApp
{
    public static void main(String[] args)  {
        RestController.start();
        SpringApplication.run(RestApp.class, args);
    }

}


