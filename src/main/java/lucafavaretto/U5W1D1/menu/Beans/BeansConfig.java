package lucafavaretto.U5W1D1.menu.Beans;

import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Drink;
import lucafavaretto.U5W1D1.entity.Pizza;

import lucafavaretto.U5W1D1.menu.Menu;
import lucafavaretto.U5W1D1.menu.toppings.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
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
    @Primary
    Pizza getMargheritaPizza() {
        return new Pizza("Margherita Pizza", 4.99, 1104);
    }

    @Bean
    Pizza getSalamiPizza() {
        return new Pizza("Salami Pizza", 5.99, 1160);
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
    Onions addOnions(MenuElement pizza) {
        return new Onions(pizza);
    }

    ;

    @Bean
    Pineapple addPineapple(MenuElement pizza) {
        return new Pineapple(pizza);
    }

    ;

    @Bean
    Salami addSalami(MenuElement pizza) {
        return new Salami(pizza);
    }

    ;


    @Bean
    Menu getMenu() {
        List<MenuElement> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();

        pizzaList.add(getHawaiianPizza());
        pizzaList.add(getMargheritaPizza());

        Pizza salamiXL = getSalamiPizza();
        salamiXL.upgradeDimensionXL();
        pizzaList.add(salamiXL);

        pizzaList.add(addOnions(getMargheritaPizza()));

        drinkList.add(getLemonade());
        drinkList.add(getWine());
        drinkList.add(getWater());


        return new Menu(pizzaList, drinkList);
    }

}
