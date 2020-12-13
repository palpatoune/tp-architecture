package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import reservation.model.Reservation;

@Service
public interface ReservationDAO extends JpaRepository<Reservation,Long> {
}
