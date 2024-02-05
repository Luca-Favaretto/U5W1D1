package lucafavaretto.U5W1D1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

import java.util.Set;

@Setter
@Getter

public abstract class Topping extends MenuElement {

    protected MenuElement menuElement;

    @Override
    public abstract String getProductName();
}





