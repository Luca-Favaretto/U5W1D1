package lucafavaretto.U5W1D1.menu.applicationContext;


import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Drink;
import lucafavaretto.U5W1D1.entity.Order;
import lucafavaretto.U5W1D1.entity.Pizza;

import lucafavaretto.U5W1D1.entity.Table;
import lucafavaretto.U5W1D1.enums.OrderState;
import lucafavaretto.U5W1D1.enums.TableState;
import lucafavaretto.U5W1D1.menu.Menu;
import lucafavaretto.U5W1D1.menu.toppings.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")

public class BeansConfig {
    @Bean
    Double getTableCharge(@Value("${order.tableCharge}") double tableCharge) {
        return tableCharge;
    }

    @Bean
    Drink getLemonade() {
        return new Drink("Lemonade", 1.29, 128, 0.33);
    }


    @Bean
    Drink getWater() {
        return new Drink("Water", 1.29, 0, 0.5);
    }

    @Bean
    Drink getWine() {
        return new Drink("Wine", 7.49, 607, 0.75);
    }

    @Bean
    Pizza getHawaiianPizza() {
        return new Pizza("Hawaiian Pizza", 6.49, 1024);
    }


    @Bean
    Pizza getSalamiPizza() {
        return new Pizza("Salami Pizza", 5.99, 1160);
    }

    @Bean
    @Primary
    Pizza getMargheritaPizza() {
        return new Pizza("Margherita Pizza", 4.99, 1104);
    }

    @Bean
    Tomato addTomato(MenuElement pizza) {
        return new Tomato(pizza);
    }


    @Bean
    Cheese addCheese(MenuElement pizza) {
        return new Cheese(pizza);
    }


    @Bean
    Onions addOnions(@Qualifier("getSalamiPizza") MenuElement pizza) {
        return new Onions(pizza);
    }


    @Bean
    Pineapple addPineapple(MenuElement pizza) {
        return new Pineapple(pizza);
    }


    @Bean
    Salami addSalami(MenuElement pizza) {
        return new Salami(pizza);
    }


    @Bean
    Table addTable1() {
        return new Table(2, TableState.READY);
    }

    @Bean
    Table addTable2() {
        return new Table(8, TableState.READY);
    }

    @Bean
    Table addTable3() {
        return new Table(8, TableState.READY);
    }


    @Bean
    Table addTable4() {
        return new Table(8, TableState.READY);
    }

    @Bean
    Table addTable5() {
        return new Table(8, TableState.READY);
    }


}
