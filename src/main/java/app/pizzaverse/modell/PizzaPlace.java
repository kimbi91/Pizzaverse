package app.pizzaverse.modell;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PizzaPlace {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    private int openingTime;

    private int closingTime;

    @OneToMany(mappedBy = "pizzaPlace")
    private List<Pizza> pizzas;


    public PizzaPlace() {
        pizzas = new ArrayList<>();
    }

    public PizzaPlace(String name, String address, int openingTime, int closingTime) {
        this();
        this.name = name;
        this.address = address;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public PizzaPlace(Long id, String name, String address, int openingTime, int closingTime) {
        this(name, address, openingTime, closingTime);
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
