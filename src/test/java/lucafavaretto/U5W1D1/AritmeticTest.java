package lucafavaretto.U5W1D1;

import org.junit.jupiter.api.AfterAll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AritmeticTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
        // Before All è una sorta di "setup iniziale", utile ad esempio per riempire il db con dei dati da testare
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
        // After All è utile per ripulire un po' la situazione. Ad es. ripristiniamo il db ad uno stato clean dopo averlo sporcato coi test.
    }

    @Test
    void sumTest() {
        int result = AritmeticFunction.sum(2, 3);
        assertEquals(result, 5);
    }

    @ParameterizedTest
    @CsvSource({"1, 1, 2", "2, 2, 4", "3, 4, 7", "5, 5, 10"})
    public void testParameterizetSumSource(int add1, int add2, int expectedResult) {
        int result = AritmeticFunction.sum(add1, add2);
        assertEquals(expectedResult, result);
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"g", "G"})
//    public void testes(int add1, int add2, int expectedResult) {
//    }
}
