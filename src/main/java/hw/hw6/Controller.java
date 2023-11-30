package hw.hw6;

import hw.hw6.model.MyList;
/**
 * Класс Controller предоставляет методы для взаимодействия с объектом MyList,
 * включая вычисление среднего значения массива, сравнение двух средних значений и создание массива.
 */
public class Controller {
    /**
     * Приватное поле myList в классе Controller представляет собой экземпляр класса MyList,
     * используемый для выполнения операций сравнения и вычисления средних значений массивов.
     */
    private MyList myList;
    /**
     * Конструктор по умолчанию для создания объекта Controller с новым экземпляром MyList.
     */
    public Controller() {
        this.myList = new MyList();
    }
    /**
     * Вычисляет среднее значение для переданного массива с использованием объекта MyList.
     *
     * @param array Массив, для которого нужно вычислить среднее значение.
     * @return Среднее значение массива.
     */
    public double averageArray(final int[] array) {
        return myList.averageArray(array);
    }
    /**
     * Сравнивает два средних значения и выполняет соответствующие действия с использованием объекта MyList.
     *
     * @param resultAverage1 Среднее значение первого массива.
     * @param resultAverage2 Среднее значение второго массива.
     */
    public void compareArray(final double resultAverage1, final double resultAverage2) {
        myList.compareArray(resultAverage1, resultAverage2);
    }
    /**
     * Создает массив случайных целых чисел от 0 до 100 с использованием объекта MyList.
     *
     * @return Созданный массив.
     */
    public int[] createArray() {
        return myList.createArray();
    }
}
