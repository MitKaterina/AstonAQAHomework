package HomeWork13;

import java.util.*; // Импортируем пакет для работы с коллекциями


public class UniqueWordsProcessor {

    public void processWords(String[] words) {

        // HashMap для подсчёта частоты слов
        Map<String, Integer> wordCountMap = new HashMap<>();

        // проходим по массиву слов
        for (String word : words) {
            // если слово уже есть в Map, увеличиваем счётчик, иначе добавляем со значением 1
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // выводим уникальные слова
        System.out.println("Список уникальных слов:");
        for (String word : wordCountMap.keySet()) { // Проходим по всем Map
            System.out.println(word); // выводим каждое уникальное слово
        }

        // выводим количество вхождений каждого слова
        System.out.println("\nКоличество каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) { // проходим по всем парам
            System.out.println(entry.getKey() + ": " + entry.getValue()); // выводим слово и его количество
        }
    }
}
