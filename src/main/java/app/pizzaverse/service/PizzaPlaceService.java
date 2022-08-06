package app.pizzaverse.service;

import app.pizzaverse.modell.PizzaPlace;
import app.pizzaverse.repository.PizzaPlaceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PizzaPlaceService {

    private PizzaPlaceRepository pizzaPlaceRepository;

    public PizzaPlaceService(PizzaPlaceRepository pizzaPlaceRepository) {
        this.pizzaPlaceRepository = pizzaPlaceRepository;
    }

    public List<PizzaPlace> getAll() {
        return new ArrayList<>((Collection) pizzaPlaceRepository.findAll());
    }
}
