package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

@Setter
@Getter
@ToString
public class Salami extends Topping {

    public Salami(MenuElement menuElement) {
        this.menuElement = menuElement;
    }

    @Override
    public String getProductName() {
        return menuElement.getProductName() + " with salami";
    }

    @Override
    public int getKcal() {
        return menuElement.getKcal() + 86;
    }

    @Override
    public double getPrice() {
        return menuElement.getPrice() + 0.99;
    }
}
