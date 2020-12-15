package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import reservation.model.Vol;

@Service
public interface VolDAO extends JpaRepository <Vol,Long> {
}
