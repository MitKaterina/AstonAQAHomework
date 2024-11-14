package animals;

// Класс Собака, наследующийся от класса Животное
public class Dog extends Animal {
    private static int dogCount = 0; // Счетчик созданных собак
    private static final int MAX_RUN_DISTANCE = 500; // Максимальная дистанция, которую может пробежать собака
    private static final int MAX_SWIM_DISTANCE = 10; // Максимальная дистанция, которую может проплыть собака

    // Конструктор класса Dog, увеличивает счетчик собак при создании объекта
    public Dog(String name) {
        super(name); // Вызов конструктора суперкласса
        dogCount++;
    }

    // Переопределенный метод для бега собаки
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    // Переопределенный метод для плавания собаки
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    // Метод для получения количества созданных собак
    public static int getDogCount() {
        return dogCount;
    }
}
