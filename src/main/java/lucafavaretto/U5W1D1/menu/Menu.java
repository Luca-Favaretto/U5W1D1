package lucafavaretto.U5W1D1.menu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lucafavaretto.U5W1D1.abstractclass.MenuElement;
import lucafavaretto.U5W1D1.entity.Drink;
import lucafavaretto.U5W1D1.entity.Table;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@Component
@Entity
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<MenuElement> pizzaList;
    private List<Table> tableList;


    public void printMenu() {
        System.out.println("******* Menu *******");
        this.pizzaList.forEach(menuElement -> System.out.println(menuElement.getProductName() + ", price" + menuElement.getPrice() + "$ and " + menuElement.getKcal() + "kcal"));
        System.out.println();
        this.tableList.forEach(System.out::println);

    }

}