package lucafavaretto.U5W1D1.abstractclass;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucafavaretto.U5W1D1.entity.Order;

import java.util.List;

@Getter
@Setter
@MappedSuperclass
public abstract class MenuElement {
    protected String name = "";
    protected double price;
    protected int kcal;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

//    @ManyToMany
//    @JoinTable(name = "menu_elements_order",
//            joinColumns = @JoinColumn(name = "order_id"),
//            inverseJoinColumns = @JoinColumn(name = "menu_element_id"))
//    private List<Order> orders;

//    @OneToMany(mappedBy = "menuElement")
//    private List<Topping> toppings;

    public String getProductName() {
        return name;
    }

}



