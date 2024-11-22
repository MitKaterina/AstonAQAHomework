package HomeWork13;

import java.util.*; // пакет для работы с коллекциями


public class PhoneBook {
    // Хранилище данных: ключ - фамилия, значение - список номеров телефонов
    private final Map<String, List<String>> phoneBookMap = new HashMap<>();


    public void add(String surname, String phone) {
        //  computeIfAbsent проверяет, есть ли фамилия в Map
        //  если нет, создаёт новый список и добавляем номер телефона
        phoneBookMap.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        // если фамилия не найдена, возвращаем пустой список
        return phoneBookMap.getOrDefault(surname, Collections.emptyList());
    }
}

