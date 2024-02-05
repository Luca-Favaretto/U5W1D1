package lucafavaretto.U5W1D1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

import java.util.Set;

@Setter
@Getter

public class Topping extends MenuElement {

    public Topping(String name, double price, int kcal) {
        super(name, price, kcal);

    }

    public Topping(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
