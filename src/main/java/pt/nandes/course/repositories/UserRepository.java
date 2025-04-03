package pt.nandes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.nandes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
