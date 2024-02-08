package lucafavaretto.U5W1D1.menu.toppings;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

@Setter
@ToString
@Getter
@Entity
@NoArgsConstructor
public class Cheese extends Topping {
    public Cheese(MenuElement menuElement) {
        this.menuElement = menuElement;
    }

    @Override
    public String getProductName() {
        return menuElement.getProductName() + " with cheese";
    }

    @Override
    public int getKcal() {
        return menuElement.getKcal() + 92;
    }

    @Override
    public double getPrice() {
        return menuElement.getPrice() + 0.69;
    }
}
