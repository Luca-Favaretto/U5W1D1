package lucafavaretto.U5W1D1.menu.toppings;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.abstractclass.Topping;

@ToString
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Onions extends Topping {


    public Onions(MenuElement menuElement) {
        this.menuElement = menuElement;
    }

    @Override
    public String getProductName() {
        return menuElement.getProductName() + " with onion";
    }

    @Override
    public int getKcal() {
        return menuElement.getKcal() + 22;
    }

    @Override
    public double getPrice() {
        return menuElement.getPrice() + 0.69;
    }
}
