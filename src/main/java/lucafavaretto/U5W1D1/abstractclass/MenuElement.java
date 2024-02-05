package lucafavaretto.U5W1D1.abstractclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor

public abstract class MenuElement {
    protected String name;
    protected double price;
    protected int kcal;

    public MenuElement(String name) {
    }


}
