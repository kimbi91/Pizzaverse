package app.pizzaverse.controllers;

import app.pizzaverse.modell.PizzaPlace;
import app.pizzaverse.repository.PizzaPlaceRepository;
import app.pizzaverse.service.PizzaPlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PizzaPlaceController {

    private PizzaPlaceService pizzaPlaceService;

    public PizzaPlaceController(PizzaPlaceService pizzaPlaceService) {
        this.pizzaPlaceService = pizzaPlaceService;
    }

    @GetMapping(value = "/pizzerias")
    public String getAllPizzaPlaces(Model model) {
        List<PizzaPlace> pizzaPlaces = pizzaPlaceService.getAll();
        model.addAttribute("pizzaPlaces", pizzaPlaces);
        return "pizzerias";
    }
}