package lucafavaretto.U5W1D1.abstractclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuElement {
    protected String name = "";
    protected double price;
    protected int kcal;


    public String getProductName() {
        return name;
    }

    public abstract int getKcal();


    public abstract double getPrice();
}



