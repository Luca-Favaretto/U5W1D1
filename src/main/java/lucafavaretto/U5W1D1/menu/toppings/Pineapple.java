package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;

@ToString
@Setter
@Getter
public class Pineapple extends Topping {
    public Pineapple() {
        super("Pineapple", 0.79, 24);
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
