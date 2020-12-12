package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import reservation.model.User;

public interface UserDAO extends JpaRepository <User,Long> {

}
