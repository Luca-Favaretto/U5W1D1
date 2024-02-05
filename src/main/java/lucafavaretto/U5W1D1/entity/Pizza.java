package lucafavaretto.U5W1D1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

import java.util.Set;

@Getter
@ToString
@Setter
public class Pizza extends MenuElement {
    protected Set<Topping> toppings;
    private boolean dimensionXL;

    public Pizza(String name, double price, int kcal, Set<Topping> toppings) {
        super(name, price, kcal);
        this.toppings = toppings;
        this.dimensionXL = false;

    }

    protected void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void upgradeDimensionXL() {
        if (this.dimensionXL = false) {
            this.dimensionXL = true;
            this.price += 2;
        }
    }
}
