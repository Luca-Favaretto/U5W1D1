package lucafavaretto.U5W1D1.menu.drinks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Drink;

@Getter

@Setter
public class Lemonade extends Drink {
    public Lemonade() {
        super("Lemonade", 1.29, 128, 0.33);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
