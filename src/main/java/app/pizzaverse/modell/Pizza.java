package app.pizzaverse.modell;

import javax.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PizzaPlace pizzaPlace;

    private String name;

    private String toppings;

    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

    private double price;

    public Pizza() {
    }

    public Pizza(String name, String toppings, PizzaSize pizzaSize, double price) {
        this.name = name;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
        this.price = price;
    }

    public Pizza(PizzaPlace pizzaPlace, String name, String toppings, PizzaSize pizzaSize, double price) {
        this(name, toppings, pizzaSize, price);
        this.pizzaPlace = pizzaPlace;
    }

    public Pizza(Long id, PizzaPlace pizzaPlace, String name, String toppings, PizzaSize pizzaSize, double price) {
        this(pizzaPlace, name, toppings, pizzaSize, price);
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public PizzaPlace getPizzaPlace() {
        return pizzaPlace;
    }

    public void setPizzaPlace(PizzaPlace pizzaPlace) {
        this.pizzaPlace = pizzaPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
