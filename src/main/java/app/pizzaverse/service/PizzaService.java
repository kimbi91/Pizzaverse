package app.pizzaverse.service;

import app.pizzaverse.modell.PizzaPlace;
import app.pizzaverse.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PizzaService {

    private PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaPlace> getAll() {
        return new ArrayList<>((Collection) pizzaRepository.findAll());
    }
}
