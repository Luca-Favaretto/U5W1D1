package lucafavaretto.U5W1D1;

import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Order;
import lucafavaretto.U5W1D1.entity.Table;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.menu.Menu;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class RestaurantTest {

    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void setup() {
        ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
    }

    @AfterAll
    static void setdown() {
        ctx.close();
    }

    @Test
    public void testMenuBean() {
        Menu menu = (Menu) ctx.getBean("menu");
        System.out.println(menu);
        assertFalse(menu.getPizzaList().isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3})
    public void testOrderBill(int a) {
        double tableCharge = (double) ctx.getBean("getTableCharge");
        List<MenuElement> el = new ArrayList<>();
        MenuElement water = (MenuElement) ctx.getBean("getWater");
        MenuElement marg = (MenuElement) ctx.getBean("getMargheritaPizza");
        Table table1 = (Table) ctx.getBean("addTable1");
        el.add(water);
        el.add(marg);
        Order order1 = new Order(table1, OrderState.BUSY, a, 21.20, el);
        double expectedBill = 12.28;
        assertEquals(expectedBill, order1.getBill(tableCharge));

    }
}
