package task2;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MaxFinderTest {
    static MaxFinder maxFinder;
    @BeforeEach
    void setUp(){
        maxFinder = new MaxFinder();
    }
    @Test
    void findMaxArrayIsEmpty1() {
        assertThrows(IllegalArgumentException.class, () -> {
            int[] array = {};
            MaxFinder.findMax(array);
        });
    }

    @Test
    void findMaxArrayReturnsMAxValue1() {
        int[] arr = {1, 2, 3, 99};
        assertEquals(99, maxFinder.findMax(arr));
    }
}
