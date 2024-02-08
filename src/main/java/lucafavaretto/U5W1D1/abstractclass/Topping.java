package lucafavaretto.U5W1D1.abstractclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;

import java.util.Set;

@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Topping extends MenuElement {

    //
//    @ManyToOne
//    @JoinColumn(name = "menu_element_id")
    @Transient
    protected MenuElement menuElement;


}





