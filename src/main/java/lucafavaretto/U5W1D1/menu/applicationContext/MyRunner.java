package lucafavaretto.U5W1D1.menu.applicationContext;


import lombok.extern.slf4j.Slf4j;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Order;
import lucafavaretto.U5W1D1.entity.Table;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
@org.springframework.core.annotation.Order(0)
@Slf4j
public class MyRunner implements CommandLineRunner {
    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        Menu m = (Menu) ctx.getBean("menu");
        m.printMenu();
        double tableCharge = (double) ctx.getBean("getTableCharge");


        List<MenuElement> el = new ArrayList<>();
        MenuElement water = (MenuElement) ctx.getBean("getWater");
        MenuElement marg = (MenuElement) ctx.getBean("getMargheritaPizza");
        log.info(marg.toString());

        Table table1 = (Table) ctx.getBean("addTable1");
        el.add(water);
        el.add(marg);
        Order order1 = new Order(table1, OrderState.BUSY, 3, 21.20, el);
        order1.getBill(tableCharge);


        el.clear();
        el.add(water);
        el.add(marg);
        el.add((MenuElement) ctx.getBean("getWine")); // Aggiungi un altro elemento al menu
        Table table2 = (Table) ctx.getBean("addTable2");
        Order order2 = new Order(table2, OrderState.BUSY, 2, 18.50, el);
        order2.getBill(tableCharge);


        el.clear();
        el.add((MenuElement) ctx.getBean("getHawaiianPizza"));
        el.add((MenuElement) ctx.getBean("getLemonade"));
        Table table3 = (Table) ctx.getBean("addTable3");
        Order order3 = new Order(table3, OrderState.BUSY, 4, 29.99, el);
        order3.getBill(tableCharge);
        ctx.close();

    }
}
