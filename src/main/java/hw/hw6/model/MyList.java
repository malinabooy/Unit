package hw.hw6.model;

import java.util.Arrays;
import java.util.Random;
/**
 * Реализация интерфейса IList предоставляет методы для сравнения массивов и вычисления среднего значения массива.
 */
public class MyList implements IList {
    /**
     * Конструктор по умолчанию для создания объекта MyList.
     */
    public MyList() {
    }
    /**
     * Сравнивает два средних значения и выводит соответствующее сообщение.
     *
     * @param resultAverage1 Среднее значение первого массива.
     * @param resultAverage2 Среднее значение второго массива.
     */
    @Override
    public void compareArray(final double resultAverage1, final double resultAverage2) {
        if (resultAverage1 == resultAverage2) {
            System.out.println("Средние значения массивов равны");
        } else if (resultAverage1 > resultAverage2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }
    /**
     * Вычисляет среднее значение массива и выводит его на экран.
     *
     * @param array Массив, для которого нужно вычислить среднее значение.
     * @return Среднее значение массива.
     */
    @Override
    public double averageArray(final int[] array) {
        double sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        double resultAverage = Math.round(sum / array.length);
        System.out.println("\nСреднее значение списка = " + resultAverage + ".\n");
        return resultAverage;
    }
    /**
     * Создает массив случайных целых чисел от 0 до 100.
     *
     * @return Созданный массив.
     */
    public int[] createArray() {
        Random random = new Random();
        int[] array = random.ints(0, 100).distinct().limit(10).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }

}
