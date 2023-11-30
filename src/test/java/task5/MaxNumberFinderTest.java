package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class MaxNumberFinderTest {

    @Test
    void findMaxNumber() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> numbers = randomNumberGenerator.generateRandomNumbers(5, -100, 100);

        for (int n: numbers) {
            assertTrue(n >= -100 && n <= 100);
        }
    }

    @Test
    void findMaxNumber_singleValue() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        List <Integer> numbers = Arrays.asList(5,3,7,9);
        assertEquals(9, maxNumberFinder.findMaxNumber(numbers));
    }
}