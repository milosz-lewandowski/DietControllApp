package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.ProductMeal;

@Repository
public interface ProductMealRepository extends JpaRepository<ProductMeal, Integer> {
}
