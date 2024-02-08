package lucafavaretto.U5W1D1.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Drink extends MenuElement {
    private double quantityLt;


    public Drink(String name, double price, int kcal, double quantityLt) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
        this.quantityLt = quantityLt;
    }

    @Override
    public int getKcal() {
        return kcal;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "quantityLt=" + quantityLt +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                '}';
    }
}
