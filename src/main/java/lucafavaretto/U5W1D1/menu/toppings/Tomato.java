package lucafavaretto.U5W1D1.menu.toppings;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
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
