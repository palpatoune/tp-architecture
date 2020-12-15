package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import reservation.model.Airport;

@Service
public interface AirportDAO extends JpaRepository<Airport,Long> {


}
