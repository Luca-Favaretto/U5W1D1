package lucafavaretto.U5W1D1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

@Getter

@Setter
public class Drink extends MenuElement {
    private double quantityLt;


    public Drink(String name, double price, int kcal, double quantityLt) {
        super(name, price, kcal);
        this.quantityLt = quantityLt;
    }
}
