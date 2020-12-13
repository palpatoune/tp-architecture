package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import reservation.model.User;

import java.util.List;

public interface UserDAO extends JpaRepository <User,Long> {

    List<User> findAll();

}
