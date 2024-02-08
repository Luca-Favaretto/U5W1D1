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
public abstract class Topping {
    @ManyToOne
    @JoinColumn(name = "menu_element_id")
    protected MenuElement menuElement;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


}





