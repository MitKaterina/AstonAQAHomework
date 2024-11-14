import animals.Animal;
import animals.Bowl;
import animals.Cat;
import animals.Dog;

public class Main {

    public static void main(String[] args) {

        task10();
    }

    public static void task10(){
        // Создаем собак и котов
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        // Собаки и коты выполняют действия
        dog1.run(150); // Собака Бобик пробегает 150 метров
        dog1.swim(8);  // Собака Бобик плывет 8 метров

        cat1.run(100); // Кот Мурзик пробегает 100 метров
        cat1.swim(5);  // Кот Мурзик пытается плавать (не умеет)

        // Создаем массив котов
        Cat[] cats = {cat1, cat2, cat3};

        // Создаем миску с 25 единицами еды
        Bowl bowl = new Bowl(25);

        // Коты пытаются поесть
        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждый кот пытается съесть 10 единиц еды
        }

        // Выводим информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем 15 единиц еды в миску
        bowl.addFood(15);
        bowl.printFood(); // Выводим оставшееся количество еды

        // Выводим общее количество созданных животных
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }


    public static void task1(){
        // Вызов методов
        printThreeWords();  // 1. Вывод трех слов в столбец
        checkSumSign();     // 2. Проверка суммы чисел и вывод результата
        printColor();       // 3. Вывод цвета в зависимости от значения переменной
        compareNumbers();   // 4. Сравнение двух чисел
        System.out.println(sumInRange(12, 7)); // 5. Проверка суммы в диапазоне 10-20
        checkPositiveOrNegative(0); // 6. Проверка, является ли число положительным или отрицательным
        System.out.println(isNegative(0)); // 7. Проверка, является ли число отрицательным или положительным
        printStringMultipleTimes("Строка для печати задание 8", 3); //8. Печать строки несколько раз
        System.out.println(leapYear(2024)); // 9. Проверка, является ли год високосным
        flipArray(); // 10. Замена в массиве 0 и 1
        fillArray(); // 11. Заполнение массива числами от 1 до 100
        multiplyIfLessThanSix(); // 12. Метод для умножения чисел, если они меньше 6
        fillDiagonal(5); // 13. Метод для заполнения диагоналей квадратного массива единицами

        int[] resultArray = createArray(5, 10); //  14. Создание массива, заполненного значением initialValue
        for (int i : resultArray) {
            System.out.print(i + " "); // вывод массива


        }
    }


    // 1. Печать трех слов в столбец
    public static void printThreeWords() {
        // Печать слов в столбец
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка суммы чисел и вывода сообщения
    public static void checkSumSign() {
        // Инициализация переменных
        int a = 10;
        int b = -5;
        // Считаем сумму
        int sum = a + b;
        // Проверяем, положительная или отрицательная сумма, и выводим сообщение
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Вывода цвета в зависимости от значения переменной
    public static void printColor() {
        // Инициализация переменной
        int value = 120;
        // Проверяем значение переменной и выводим соответствующий цвет
        if (value <= 0) {
            System.out.println("Красный"); // value меньше 0 (0 включительно)
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый"); // в пределах от 0(0 исключительно) до 100(100 включительно)
        } else {
            System.out.println("Зеленый"); // больше 100 (100 исключительно)
        }
    }

    // 4. Сравнение двух чисел
    public static void compareNumbers() {
        // Инициализация переменных
        int a = 5;
        int b = 7;
        // Сравниваем значения a и b и выводим соответствующее сообщение
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка, что сумма двух чисел находится в пределах от 10 до 20 (включительно)
    public static boolean sumInRange(int a, int b) {
        // считаем сумму
        int sum = a + b;
        // Проверяем, попадает ли сумма в диапазон от 10 до 20
        return sum >= 10 && sum <= 20;
    }

    // 6. Проверка, является ли число положительным или отрицательным
    public static void checkPositiveOrNegative(int number) {
        // Если число больше или равно нулю, выводим сообщение, что оно положительное
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            // Иначе выводим сообщение, что оно отрицательное
            System.out.println("Число отрицательное");
        }
    }

    // 7. Проверка, является ли число отрицательным или положительным
    public static boolean isNegative(int number) {
        // Если число меньше нуля, возвращаем true, иначе false
        return number < 0;
    }

    // 8. Печати строки указанное количество раз
    public static void printStringMultipleTimes(String str, int times) {
        // цикл для печати строки нужное количество раз
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Проверка, является ли год високосным
    public static boolean leapYear(int year) {
        // каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й високосный
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    // 10. Замена в массиве 0 на 1, 1 на 0
    public static void flipArray() {
        // инициализация массива
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // проходим по массиву и меняем 1 на 0 и 0 на 1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        // Вывод массива
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 11. Заполнение массива числами от 1 до 100
    public static void fillArray() {
        // инициализация массива длиной 100
        int[] arr = new int[100];
        // заполняем массив числами от 1 до 100 с помощью цикла
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // вывод массива
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 12. Умножения чисел, если они меньше 6
    public static void multiplyIfLessThanSix() {
        // инициализация массива
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // проходим по массиву, и если значение меньше 6, умножаем его на 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        // выводим массив
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 13. Заполнения диагоналей квадратного массива единицами
    public static void fillDiagonal(int size) {
        // инициализация двумерного массива
        int[][] arr = new int[size][size];
        // заполняем обе диагонали единицами
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1; // левая диагональ
            arr[i][size - i - 1] = 1; // правая диагональ
        }
        // вывод массива
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // 14. Создание одномерного массива заданной длины, заполненного initialValue
    public static int[] createArray(int len, int initialValue) {
        // инициализация массива заданной длины
        int[] arr = new int[len];
        // заполнение массива значением initialValue
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        // возвращаем массив
        return arr;
    }
}

