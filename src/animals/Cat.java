package animals;

// Класс Кот, наследующийся от класса Животное
public class Cat extends Animal {
    private static int catCount = 0; // Счетчик созданных котов
    private static final int MAX_RUN_DISTANCE = 200; // Максимальная дистанция, которую может пробежать кот
    private boolean isFull; // Поле, указывающее, сыт ли кот

    // Конструктор класса Cat, увеличивает счетчик котов
    public Cat(String name) {
        super(name); // Вызов конструктора суперкласса
        this.isFull = false; // По умолчанию кот голоден
        catCount++;
    }

    // Переопределенный метод для бега кота
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    // Переопределенный метод для плавания кота (кот не умеет плавать)
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    // Метод для кормления кота
    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount); // Уменьшение количества еды в миске
            this.isFull = true; // Кот становится сытым
            System.out.println(name + " поел " + foodAmount + " единиц еды.");
        } else {
            System.out.println(name + " не хватает еды. В миске " + bowl.getFood() + " единиц еды.");
        }
    }

    // Метод для проверки, сыт ли кот
    public boolean isFull() {
        return isFull;
    }

    // Метод для получения количества созданных котов
    public static int getCatCount() {
        return catCount;
    }
}
