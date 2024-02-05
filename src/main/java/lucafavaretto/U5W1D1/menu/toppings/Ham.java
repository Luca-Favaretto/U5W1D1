package lucafavaretto.U5W1D1.menu.toppings;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

@ToString
@Setter
@Getter
public class Ham extends Topping {

    public Ham(MenuElement menuElement) {
        this.menuElement = menuElement;
    }

    @Override
    public String getProductName() {
        return menuElement.getProductName() + " with tomato";
    }

    @Override
    public int getKcal() {
        return menuElement.getKcal() + 35;
    }

    @Override
    public double getPrice() {
        return menuElement.getPrice() + 0.20;
    }
}
