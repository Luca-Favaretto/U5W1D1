package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Topping;

@ToString
@Setter
@Getter
public class Ham extends Topping {
    public Ham() {
        super("Ham", 0.99, 35);
    }

    @Override
    public String toString() {
        return "Ham{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
