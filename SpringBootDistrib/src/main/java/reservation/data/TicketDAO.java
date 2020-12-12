package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import reservation.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket,Long> {
}
