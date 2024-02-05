package lucafavaretto.U5W1D1.menu.Beans;

import lucafavaretto.U5W1D1.entity.Pizza;
import lucafavaretto.U5W1D1.entity.Topping;
import lucafavaretto.U5W1D1.menu.drinks.Lemonade;
import lucafavaretto.U5W1D1.menu.drinks.Water;
import lucafavaretto.U5W1D1.menu.drinks.Wine;
import lucafavaretto.U5W1D1.menu.pizzas.HawaiianPizza;
import lucafavaretto.U5W1D1.menu.pizzas.Margherita;
import lucafavaretto.U5W1D1.menu.pizzas.SalamiPizza;
import lucafavaretto.U5W1D1.menu.toppings.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
public class BeansConfig {
    @Bean
    Lemonade getLemonade() {
        return new Lemonade();
    }

    @Bean
    Water getWater() {
        return new Water();
    }

    @Bean
    Wine getWine() {
        return new Wine();
    }

    @Bean
    HawaiianPizza getHawaiianPizza() {
        return new HawaiianPizza();
    }

    @Bean
    Margherita getMargherita() {
        return new Margherita();
    }


    @Bean
    SalamiPizza getSalamiPizza() {
        return new SalamiPizza();
    }

    @Bean
    Cheese getCheese() {
        return new Cheese();
    }

    @Bean
    Ham getHam() {
        return new Ham();
    }

    @Bean
    Onions getOnions() {
        return new Onions();
    }

    @Bean
    Pineapple getPineapple() {
        return new Pineapple();
    }

    @Bean
    Salami getSalami() {
        return new Salami();
    }


}
