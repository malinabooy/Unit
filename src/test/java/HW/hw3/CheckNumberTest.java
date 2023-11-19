package HW.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.FactorialCalculator;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberTest {

    CheckNumber checkNumber;

    @BeforeEach
    void setUp() {
        checkNumber = new CheckNumber();
    }
    @Test
    void evenOddNumber() {
        assertTrue(checkNumber.evenOddNumber(2)); // четное число
        assertFalse(checkNumber.evenOddNumber(3)); // нечетное число
        assertTrue(checkNumber.evenOddNumber(0)); // четное число
        assertFalse(checkNumber.evenOddNumber(-1)); // нечетное число
    }

    @Test
    void numberInInterval() {
        assertTrue(CheckNumber.numberInInterval(50)); // число в интервале (25;100)
        assertFalse(CheckNumber.numberInInterval(10)); // число не в интервале (25;100)
        assertFalse(CheckNumber.numberInInterval(200)); // число не в интервале (25;100)
        assertFalse(CheckNumber.numberInInterval(25)); // число на границе интервала
    }
}