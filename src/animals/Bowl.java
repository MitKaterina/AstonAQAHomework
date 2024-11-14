package animals;

// Класс Миска для хранения и управления количеством еды
public class Bowl {
    private int food; // Количество еды в миске

    // Конструктор для инициализации миски с едой
    public Bowl(int food) {
        this.food = food;
    }

    // Метод для получения текущего количества еды
    public int getFood() {
        return food;
    }

    // Метод для уменьшения количества еды
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount; // Уменьшение количества еды
        } else {
            System.out.println("Недостаточно еды в миске для уменьшения на " + amount + " единиц.");
        }
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " единиц еды в миску.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    // Метод для печати текущего количества еды в миске
    public void printFood() {
        System.out.println("В миске осталось " + food + " единиц еды.");
    }
}
