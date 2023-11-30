package hw.hw6.model;
/**
 * Интерфейс IList предоставляет методы для сравнения массивов и
 * вычисления среднего значения массива.
 */
public interface IList {
    /**
     * Сравнивает два средних значения и выполняет соответствующие действия.
     *
     * @param resultAverage1 Среднее значение первого массива.
     * @param resultAverage2 Среднее значение второго массива.
     */
    void compareArray(double resultAverage1, double resultAverage2);
    /**
     * Вычисляет среднее значение для переданного массива.
     *
     * @param array Массив, для которого нужно вычислить среднее значение.
     * @return Среднее значение массива.
     */
    double averageArray(int[] array);
}
