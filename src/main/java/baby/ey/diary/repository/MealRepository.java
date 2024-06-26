package baby.ey.diary.repository;

import baby.ey.diary.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
    List<Meal> findAllByOrderByCreatedDesc();
    Optional<Meal> findTopByOrderByCreatedDesc();
}
