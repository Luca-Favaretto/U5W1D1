package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;

@Setter
@ToString
@Getter
public class Cheese extends Topping {
    public Cheese() {
        super("Cheese", 0.69, 92);
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
