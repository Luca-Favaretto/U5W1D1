package lucafavaretto.U5W1D1.menu.drinks;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.entity.Drink;

@Getter

@Setter
public class Wine extends Drink {
    private int alcool;

    public Wine() {
        super("Wine", 7.49, 607, 0.75);
        this.alcool = 13;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "alcool=" + alcool +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
