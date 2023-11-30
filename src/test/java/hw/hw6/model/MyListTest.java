package hw.hw6.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class MyListTest {

    MyList myList;


    @BeforeEach
    void setUp() {
        myList = new MyList();
    }

    @Test
    void testCompareArray() {
        MyList myList = new MyList();

        // Тестирование ситуации, когда средние значения равны
        assertDoesNotThrow(() -> myList.compareArray(5.0, 5.0));

        // Тестирование ситуации, когда первое среднее значение больше второго
        assertDoesNotThrow(() -> myList.compareArray(6.0, 5.0));

        // Тестирование ситуации, когда второе среднее значение больше первого
        assertDoesNotThrow(() -> myList.compareArray(5.0, 6.0));
    }

    @Test
    void testAverageArray() {
        MyList myList = new MyList();

        // Тестирование ситуации, когда массив пуст

        assertEquals(0.0, myList.averageArray(new int[] {}));

        // Тестирование ситуации, когда массив не пуст
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, myList.averageArray(array));
    }

    @Test
    void testCreateArray() {
        MyList myList = new MyList();

        // Проверка, что созданный массив имеет правильный размер
        assertEquals(10, myList.createArray().length);
    }
}