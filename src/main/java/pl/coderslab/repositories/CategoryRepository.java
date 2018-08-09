package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository <Category, Integer> {

}
