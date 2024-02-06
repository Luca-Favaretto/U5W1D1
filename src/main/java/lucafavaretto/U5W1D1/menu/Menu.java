package lucafavaretto.U5W1D1.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Drink;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@Component
public class Menu {
    private List<MenuElement> pizzaList;
    private List<Drink> drinkList;


    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(menuElement -> System.out.println(menuElement.getProductName() + ", price" + menuElement.getPrice() + "$ and " + menuElement.getKcal() + "kcal"));
        System.out.println();


        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}