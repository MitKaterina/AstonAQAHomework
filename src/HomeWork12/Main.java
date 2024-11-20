package HomeWork12;

/**1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
*при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
*
*2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
*Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
*должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
*
*3. В методе main() вызвать полученный метод, обработать возможные исключения
*MyArraySizeException и MyArrayDataException, и вывести результат расчета.
 */

public class Main {

    //Исключение MyArraySizeException
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    //Исключение MyArrayDataException

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }


    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверяем размер массива (длина должна быть 4).
        if (array.length != 4) {
            throw new MyArraySizeException("Некорректный размер массива: "
                    + array.length + "x" + (array.length > 0 ? array[0].length : "0"));
        }

        // Проверяем длину каждой строки (каждая строка должна содержать 4 элемента).
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Некорректный размер массива");
            }
        }

        int sum = 0; // Переменная для хранения суммы всех элементов массива.

        // Проходим по всем элементам массива.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразуем элемент массива из строки в число.
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если преобразование не удалось, бросаем исключение с координатами ячейки.
                    throw new MyArrayDataException("Ошибка! Ячейка [" + i + "][" + j
                            + "] содержит некорректное значение \"" + array[i][j] + "\"");
                }
            }
        }

        return sum; // Возвращаем сумму.
    }


    public static void main(String[] args) {
        // Корректный массив 4x4
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Массив с неправильным размером
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        // Массив с некорректными данными (буква вместо числа)
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "A", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            System.out.println("Сумма элементов массива: " + processArray(validArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + processArray(invalidSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + processArray(invalidDataArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
