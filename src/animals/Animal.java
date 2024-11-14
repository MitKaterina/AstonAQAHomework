package animals;

// Абстрактный базовый класс для всех животных
abstract public class Animal {
    public String name; // Имя животного
    public static int animalCount = 0; // Счетчик всех созданных животных

    // Конструктор, увеличивающий счетчик животных при создании нового объекта
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    public abstract void run(int distance);
    public abstract void swim(int distance);

    // Метод для получения общего количества созданных животных
    public static int getAnimalCount() {
        return animalCount;
    }
}