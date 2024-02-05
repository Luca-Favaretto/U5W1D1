package lucafavaretto.U5W1D1.menu.toppings;

import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

public class Tomato extends Topping {

    public Tomato(MenuElement menuElement) {
        this.menuElement = menuElement;
    }

    @Override
    public String getProductName() {
        return menuElement.getProductName() + " with tomato";
    }

    @Override
    public int getKcal() {
        return menuElement.getKcal() + 20;
    }

    @Override
    public double getPrice() {
        return menuElement.getPrice() + 0.20;
    }
}
