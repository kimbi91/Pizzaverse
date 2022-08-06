package app.pizzaverse.repository;

import app.pizzaverse.modell.PizzaPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaPlaceRepository extends CrudRepository<PizzaPlace, Long> {
}
