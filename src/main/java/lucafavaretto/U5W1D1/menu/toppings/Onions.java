package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;

@ToString
@Setter
@Getter
public class Onions extends Topping {
    public Onions() {
        super("Onions", 0.69, 22);
    }

    @Override
    public String toString() {
        return "Onions{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
