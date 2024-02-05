package lucafavaretto.U5W1D1.menu.pizzas;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Pizza;
import lucafavaretto.U5W1D1.entity.Topping;
import lucafavaretto.U5W1D1.menu.toppings.Cheese;
import lucafavaretto.U5W1D1.menu.toppings.Ham;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
public class Margherita extends Pizza {


    public Margherita() {
        super("Margherita", 4.99, 1104, createToppingsSet());
    }


    public Margherita(String name, double price, int kcal, Set<Topping> toppings) {
        super(name, price, kcal, createToppingsSet());
    }

    public static Set<Topping> createToppingsSet() {
        Set<Topping> toppings = new HashSet<>();
        toppings.add(new Cheese());
        toppings.add(new Topping("Tomato"));
        return toppings;
    }

    @Override
    public String toString() {
        return "Margherita{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
