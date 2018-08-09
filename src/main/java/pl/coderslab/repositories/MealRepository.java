package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Meal;
@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
}
