package lucafavaretto.U5W1D1.menu.pizzas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;
import lucafavaretto.U5W1D1.menu.toppings.Cheese;
import lucafavaretto.U5W1D1.menu.toppings.Ham;
import lucafavaretto.U5W1D1.menu.toppings.Pineapple;
import lucafavaretto.U5W1D1.menu.toppings.Salami;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString

public class HawaiianPizza extends Margherita {


    public HawaiianPizza() {
        super("Hawaiian Pizza", 6.49, 1024, createToppingsSet());
    }

    public static Set<Topping> createToppingsSet() {
        Set<Topping> toppings = new HashSet<>();
        toppings.add(new Ham());
        toppings.add(new Cheese());
        toppings.add(new Topping("Tomato"));
        toppings.add(new Pineapple());
        return toppings;
    }

    @Override
    public String toString() {
        return "HawaiianPizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
