package reservation.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import reservation.model.User;

import java.util.List;

@Service
public interface UserDAO extends JpaRepository <User,Long> {

    List<User> findAll();

}
