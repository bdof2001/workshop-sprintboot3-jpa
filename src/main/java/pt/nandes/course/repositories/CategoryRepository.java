package pt.nandes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.nandes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
