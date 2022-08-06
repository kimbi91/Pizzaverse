package app.pizzaverse.controllers;

import app.pizzaverse.service.TestDataLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private TestDataLoader testDataLoader;


    public MainController(TestDataLoader testDataLoader) {
        this.testDataLoader = testDataLoader;
    }

    @GetMapping(value = {"/", "/home"})
    public String getHome() {
        return "index";
    }

    @GetMapping(value = "/test")
    public String testData() {
        testDataLoader.loadData();
        return "redirect:/home";
    }
}
