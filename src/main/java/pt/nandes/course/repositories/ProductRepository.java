package pt.nandes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.nandes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
