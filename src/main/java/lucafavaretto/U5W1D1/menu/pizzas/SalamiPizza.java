package lucafavaretto.U5W1D1.menu.pizzas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;
import lucafavaretto.U5W1D1.menu.toppings.Cheese;
import lucafavaretto.U5W1D1.menu.toppings.Salami;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString

public class SalamiPizza extends Margherita {

    public SalamiPizza() {
        super("Salami Pizza", 5.99, 1160, createToppingsSet());
    }

    public static Set<Topping> createToppingsSet() {
        Set<Topping> toppings = new HashSet<>();
        toppings.add(new Cheese());
        toppings.add(new Topping("Tomato"));
        toppings.add(new Salami());
        return toppings;
    }

    @Override
    public String toString() {
        return "SalamiPizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
