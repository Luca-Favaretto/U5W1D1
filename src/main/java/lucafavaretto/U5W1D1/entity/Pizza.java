package lucafavaretto.U5W1D1.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

@Getter
@ToString
@Setter
@Entity
@NoArgsConstructor
public class Pizza extends MenuElement {

    protected boolean dimensionXL;


    public Pizza(String name, double price, int kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
        this.dimensionXL = false;
    }


    public void upgradeDimensionXL() {
        if (!this.dimensionXL) {
            this.name = getProductName() + " XL";
            this.kcal += 200;
            this.dimensionXL = true;
            this.price += 2;
        }
    }

    @Override
    public int getKcal() {
        return kcal;
    }


    @Override
    public double getPrice() {
        return price;
    }
}
