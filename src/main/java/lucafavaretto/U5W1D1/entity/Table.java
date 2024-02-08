package lucafavaretto.U5W1D1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucafavaretto.U5W1D1.enums.TableState;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Getter
@Setter
//@Entity
//@NoArgsConstructor
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private int maxCustomers;
    private TableState tableState;

    //    @OneToMany(mappedBy = "table")
    private List<Order> orders;

    @Autowired
    public Table(int maxCustomers, TableState tableState) {
        this.maxCustomers = maxCustomers;
        this.tableState = tableState;
    }

    @Override
    public String toString() {
        return "Table{" +
                "maxCustomers=" + maxCustomers +
                ", tableState=" + tableState +
                '}';
    }
}
