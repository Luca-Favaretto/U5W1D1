package lucafavaretto.U5W1D1;

import lucafavaretto.U5W1D1.menu.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class U5W1D1Application {


    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
        Menu m = (Menu) ctx.getBean("getMenu");
        m.printMenu();
        ctx.close();

    }
}
