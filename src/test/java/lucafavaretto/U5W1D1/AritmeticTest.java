package lucafavaretto.U5W1D1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AritmeticTest {

    @Test
    void sumTest() {
        int result = AritmeticFunction.sum(2, 3);
        Assertions.assertEquals(result, 5);
    }
}
