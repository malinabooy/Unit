package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    FactorialCalculator factorialCalculator;
    @BeforeEach
    void setUp() {
        factorialCalculator = new FactorialCalculator();
    }

    @Test
    void calculateFactorial() {
        int value = -1;
        assertThrows(IllegalAccessException.class, () -> factorialCalculator.calculateFactorial(value));
    }

    @Test
    void calculateFactorialCheckResult(){
        int vas = factorialCalculator.calculateFactorial(5);
        assertEquals(120, factorialCalculator.calculateFactorial(5));
    }
}
