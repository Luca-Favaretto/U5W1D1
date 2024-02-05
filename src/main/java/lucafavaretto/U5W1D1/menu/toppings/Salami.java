package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;

@Setter
@Getter
@ToString
public class Salami extends Topping {
    public Salami() {
        super("Salami", 0.99, 86);
    }

    @Override
    public String toString() {
        return "Salami{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
