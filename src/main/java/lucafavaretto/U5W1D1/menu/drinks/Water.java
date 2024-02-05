package lucafavaretto.U5W1D1.menu.drinks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Drink;

@Setter

@Getter
public class Water extends Drink {
    public Water() {
        super("Water", 1.29, 0, 0.5);
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
