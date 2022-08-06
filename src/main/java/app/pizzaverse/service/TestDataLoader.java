package app.pizzaverse.service;

import app.pizzaverse.modell.Pizza;
import app.pizzaverse.modell.PizzaPlace;
import app.pizzaverse.modell.PizzaSize;
import app.pizzaverse.repository.PizzaPlaceRepository;
import app.pizzaverse.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TestDataLoader {

    private PizzaPlaceRepository pizzaPlaceRepository;

    private PizzaRepository pizzaRepository;


    public TestDataLoader(PizzaPlaceRepository pizzaPlaceRepository, PizzaRepository pizzaRepository) {
        this.pizzaPlaceRepository = pizzaPlaceRepository;
        this.pizzaRepository = pizzaRepository;
    }

    public void loadData() {
        PizzaPlace p1 = new PizzaPlace("Pizzakalap", "Budapest", 8, 20);
        PizzaPlace p2 = new PizzaPlace("Don Pipi", "Budapest", 8, 20);
        PizzaPlace p3 = new PizzaPlace("Pi-zza", "Budapest", 8, 20);

        Pizza pz1 = new Pizza(p1, "Random pizza", "Sajt, gomba, sonka", PizzaSize.LARGE, 19.99);
        Pizza pz2 = new Pizza(p2, "Kertész pizza", "Sajt, gomba, paradicsom", PizzaSize.SMALL, 19.98);
        Pizza pz3 = new Pizza(p3, "Baromfi pizza", "Sajt, gomba, tojás", PizzaSize.LARGE, 19.97);
        Pizza pz4 = new Pizza(p1, "Kőműves pizza", "Sajt, gomba, tégla", PizzaSize.SMALL, 19.96);
        Pizza pz5 = new Pizza(p2, "Földön kívüli pizza", "Sajt, gomba, ufóvér", PizzaSize.LARGE, 19.95);
        Pizza pz6 = new Pizza(p3, "Suszter pizza", "Sajt, gomba, cipőtalp", PizzaSize.SMALL, 19.94);
        Pizza pz7 = new Pizza(p1, "A hód pizza", "Sajt, gomba, tölgyfa levél", PizzaSize.LARGE, 19.93);
        Pizza pz8 = new Pizza(p2, "Vega pizza", "Sajt, gomba, répa", PizzaSize.SMALL, 19.92);

        p1.getPizzas().add(pz1);
        p1.getPizzas().add(pz4);
        p1.getPizzas().add(pz7);

        p2.getPizzas().add(pz2);
        p2.getPizzas().add(pz5);
        p2.getPizzas().add(pz8);

        p3.getPizzas().add(pz3);
        p3.getPizzas().add(pz6);

        pizzaPlaceRepository.saveAll(Arrays.asList(p1, p2, p3));

        pizzaRepository.saveAll(Arrays.asList(pz1, pz2, pz3, pz4, pz5, pz6, pz7, pz8));
    }
}
