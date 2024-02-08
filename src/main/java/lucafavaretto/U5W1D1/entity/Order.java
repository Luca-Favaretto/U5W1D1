package lucafavaretto.U5W1D1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.enums.TableState;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
//@Entity
//@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private OrderState orderState;
    private int nCustomer;
    private double hour;
    //    @ManyToMany
//    @JoinTable(name = "menu_elements_order",
//            joinColumns = @JoinColumn(name = "menu_element_id"),
//            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<MenuElement> menuElements;

    //    @ManyToOne
//    @JoinColumn(name = "id_order")
    private Table table;

    @Autowired
    public Order(Table table, OrderState orderState, int nCustomer, double hour, List<MenuElement> menuElements) {
        this.table = table;
        this.orderState = orderState;
        this.nCustomer = nCustomer;
        this.hour = hour;
        this.menuElements = menuElements;
        table.setTableState(TableState.IN_PROGRESS);
    }

    public double getBill(double tableCharge) {
        double bill = 0;
        for (MenuElement el : menuElements) {
            bill += el.getPrice();
        }
        bill += (nCustomer * tableCharge);
        double roundedBill = Math.round(bill * 100.0) / 100.0;

        System.out.println("The bill of table " + table.getId() + " is " + roundedBill);

        table.setTableState(TableState.SERVED);
        setOrderState(OrderState.FREE);

        return roundedBill;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", table=" + table +
                ", orderState=" + orderState +
                ", nCustomer=" + nCustomer +
                ", hour=" + hour +
                ", menuElements=" + menuElements +
                '}';
    }
}
