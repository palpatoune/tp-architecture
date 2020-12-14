package reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reservation.controller.RestApiController;

@SpringBootApplication
public class RestApp
{
    public static void main(String[] args)  {
        RestApiController.start();
        SpringApplication.run(RestApp.class, args);
    }

}


