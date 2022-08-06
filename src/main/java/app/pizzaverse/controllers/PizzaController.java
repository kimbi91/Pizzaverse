package app.pizzaverse.controllers;

import app.pizzaverse.modell.PizzaPlace;
import app.pizzaverse.service.PizzaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PizzaController {

    private PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping(value = "/pizzas")
    public String getAllPizzaPlaces(Model model) {
        List<PizzaPlace> pizzas = pizzaService.getAll();
        model.addAttribute("pizzas", pizzas);
        return "pizzas";
    }
}
