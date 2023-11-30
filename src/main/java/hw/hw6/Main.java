package hw.hw6;
/**
 * Класс Main представляет точку входа в программу и иллюстрирует использование класса Controller.
 * Создаются массивы, вычисляются их средние значения, и результаты сравниваются с использованием методов Controller.
 */
public class Main {
    /**
     * Точка входа в программу. Создает экземпляр Controller, генерирует два массива,
     * вычисляет их средние значения и сравнивает результаты.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(final String[] args) {
        // Создание экземпляра Controller
        Controller controller = new Controller();
        // Создание первого массива и вычисление среднего значения
        int[] array1 = controller.createArray();
        double averageArray1 = controller.averageArray(array1);
        // Создание второго массива и вычисление среднего значения
        int[] array2 = controller.createArray();
        double averageArray2 = controller.averageArray(array2);
        // Сравнение средних значений двух массивов
        controller.compareArray(averageArray1, averageArray2);
    }
}
