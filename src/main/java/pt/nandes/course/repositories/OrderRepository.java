package pt.nandes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.nandes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
