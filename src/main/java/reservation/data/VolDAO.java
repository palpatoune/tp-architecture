package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import reservation.model.Vol;

public interface VolDAO extends JpaRepository <Vol,Long> {
}
