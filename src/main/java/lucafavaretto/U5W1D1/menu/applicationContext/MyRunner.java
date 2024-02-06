package lucafavaretto.U5W1D1.menu.applicationContext;


import lucafavaretto.U5W1D1.entity.Order;
import lucafavaretto.U5W1D1.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        Menu m = (Menu) ctx.getBean("getMenu");
        m.printMenu();

        ctx.close();

    }
}
