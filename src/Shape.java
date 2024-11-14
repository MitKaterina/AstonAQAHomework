public interface Shape {
    // Метод для расчета периметра
    double calculatePerimeter();

    // Метод для расчета площади
    double calculateArea();

    // Метод для получения цвета заливки
    String getFillColor();

    // Метод для получения цвета границы
    String getBorderColor();

    // Дефолтный метод для вывода характеристик фигуры
    default void displayCharacteristics() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}