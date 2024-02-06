package lucafavaretto.U5W1D1.entity;

import lombok.Getter;
import lombok.Setter;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.enums.TableState;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
public class Order {
    private int id;
    private Table table;
    private OrderState orderState;
    private int nCustomer;
    private double hour;
    private List<MenuElement> menuElements;


    @Autowired
    public Order(int id, Table table, OrderState orderState, int nCustomer, double hour, List<MenuElement> menuElements) {
        this.id = id;
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
        System.out.println(tableCharge);
        System.out.println("The bill of table " + table.getId() + " is " + bill);
        table.setTableState(TableState.SERVED);
        setOrderState(OrderState.FREE);
        return bill;
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
