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

    }
}


