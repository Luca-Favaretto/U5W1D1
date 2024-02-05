package lucafavaretto.U5W1D1;

import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Drink;
import lucafavaretto.U5W1D1.entity.Pizza;
import lucafavaretto.U5W1D1.menu.drinks.Lemonade;
import lucafavaretto.U5W1D1.menu.drinks.Water;
import lucafavaretto.U5W1D1.menu.drinks.Wine;
import lucafavaretto.U5W1D1.menu.pizzas.HawaiianPizza;
import lucafavaretto.U5W1D1.menu.pizzas.Margherita;
import lucafavaretto.U5W1D1.menu.pizzas.SalamiPizza;
import lucafavaretto.U5W1D1.menu.toppings.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class U5W1D1Application {


    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
        Set<MenuElement> menu = new HashSet<>();
        menu.add((Lemonade) ctx.getBean("getLemonade"));
        menu.add((Water) ctx.getBean("getWater"));
        menu.add((Wine) ctx.getBean("getWine"));
        menu.add((HawaiianPizza) ctx.getBean("getHawaiianPizza"));
        Pizza marg = ((Margherita) ctx.getBean("getMargherita"));
        marg.upgradeDimensionXL();
        menu.add(marg);
        menu.add((SalamiPizza) ctx.getBean("getSalamiPizza"));
        menu.add((Cheese) ctx.getBean("getCheese"));
        menu.add((Ham) ctx.getBean("getHam"));
        menu.add((Onions) ctx.getBean("getOnions"));
        menu.add((Pineapple) ctx.getBean("getPineapple"));
        menu.add((Salami) ctx.getBean("getSalami"));


        menu.forEach(System.out::println);
    }
}
