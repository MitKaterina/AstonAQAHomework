package HomeWork13;

import java.util.*; // пакет для работы с коллекциями


public class Main {

    public static void main(String[] args) {
        // Задание 1: Массив со словами
        System.out.println("Задание 1: Работа с массивом слов"); // заголовок для первого задания

        // массив слов с повторениями
        String[] words = {
                "яблоко", "банан", "вишня", "яблоко", "груша",
                "апельсин", "банан", "лимон", "виноград", "вишня",
                "яблоко", "ананас", "груша", "вишня", "апельсин"
        };

        // обработка уникальных слов
        UniqueWordsProcessor processor = new UniqueWordsProcessor();
        // обработка массива слов
        processor.processWords(words);

        // Разделитель между заданиями
        System.out.println("\n=========================\n");

        // Задание 2: Телефонный справочник
        System.out.println("Задание 2: Телефонный справочник"); // заголовок для второго задания

        // Создаём экземпляр класса телефонного справочника
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Иванов", "123-456"); // Иванов с номером 123-456
        phoneBook.add("Петров", "987-654"); // Петров с номером 987-654
        phoneBook.add("Сидоров", "555-555"); // Сидоров с номером 555-555
        phoneBook.add("Иванов", "111-111"); // Добавляем ещё один номер для Иванова
        phoneBook.add("Сидоров", "222-222"); // Добавляем ещё один номер для Сидорова

        // Ищем телефоны по фамилиям и выводим результат
        System.out.println("Телефон Иванова: " + phoneBook.get("Иванов")); // Телефон Иванова
        System.out.println("Телефон Сидорова: " + phoneBook.get("Сидоров")); // Телефон Сидорова
        System.out.println("Телефон Петрова: " + phoneBook.get("Петров")); // Телефон Петрова
        System.out.println("Телефон Николаева: " + phoneBook.get("Николаев")); // Телефон Николаева (нет в справочнике)
    }
}

