package lucafavaretto.U5W1D1;

import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Order;
import lucafavaretto.U5W1D1.entity.Table;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.menu.Menu;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@SpringBootApplication
public class U5W1D1Application {


    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
        double tableCharge = (double) ctx.getBean("getTableCharge");


        List<MenuElement> el = new ArrayList<>();
        MenuElement water = (MenuElement) ctx.getBean("getWater");
        MenuElement marg = (MenuElement) ctx.getBean("getMargheritaPizza");


        Table table1 = (Table) ctx.getBean("addTable1");
        el.add(water);
        el.add(marg);
        Order order1 = new Order(1, table1, OrderState.BUSY, 3, 21.20, el);
        order1.getBill(tableCharge);


        el.clear();
        el.add(water);
        el.add(marg);
        el.add((MenuElement) ctx.getBean("getWine")); // Aggiungi un altro elemento al menu
        Table table2 = (Table) ctx.getBean("addTable2");
        Order order2 = new Order(2, table2, OrderState.BUSY, 2, 18.50, el);
        order2.getBill(tableCharge);


        el.clear();
        el.add((MenuElement) ctx.getBean("getHawaiianPizza"));
        el.add((MenuElement) ctx.getBean("getLemonade"));
        Table table3 = (Table) ctx.getBean("addTable3");
        Order order3 = new Order(3, table3, OrderState.BUSY, 4, 29.99, el);
        order3.getBill(tableCharge);

        ctx.close();
    }
}


