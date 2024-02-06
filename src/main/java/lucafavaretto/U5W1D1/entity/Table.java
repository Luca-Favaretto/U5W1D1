package lucafavaretto.U5W1D1.entity;

import lombok.Getter;
import lombok.Setter;
import lucafavaretto.U5W1D1.enums.TableState;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Table {
    private int id;
    private int maxCustomers;
    private TableState tableState;

    @Autowired
    public Table(int id, int maxCustomers, TableState tableState) {
        this.id = id;
        this.maxCustomers = maxCustomers;
        this.tableState = tableState;
    }
}
