import java.util.ArrayList;  //Импортируем класс ArrayList из пакета java.util

// Главный класс для домашнего задания, который содержит метод main для запуска программы
public class HomeWork6 {
    public static void main(String[] args) {
        // Создаем массив из 5 объектов класса Employee (Сотрудник)
        Employee[] employees = new Employee[5];

        // Инициализируем каждый элемент массива экземпляром класса Employee с данными о сотрудниках
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.com", "89123213", 45000, 35);
        employees[2] = new Employee("Sidorov Sergey", "Analyst", "sidorov@mail.com", "8901234567", 50000, 40);
        employees[3] = new Employee("Smirnov Oleg", "Technician", "olegsmirnov@mail.com", "8923456789", 25000, 28);
        employees[4] = new Employee("Kuznetsova Maria", "Developer", "mariakuz@mail.com", "8934567890", 60000, 45);

        // Выводим информацию о каждом сотруднике с использованием метода info()
        for (Employee employee : employees) {
            employee.info();
        }

        // Создаем объект класса Park для хранения информации об аттракционах
        Park park = new Park();

        // Добавляем аттракционы с помощью метода addAttraction (название, время работы, стоимость)
        park.addAttraction("Колобок", "10:00 - 22:00", 5);
        park.addAttraction("Автодром", "10:00 - 22:00", 8);

        // Выводим информацию обо всех аттракционах
        park.showAttractions();
    }
}

// Класс Employee (Сотрудник) с полями: ФИО, должность, email, телефон, зарплата и возраст
class Employee {
    private String fullName;     // ФИО сотрудника
    private String position;     // Должность
    private String email;        // Почта
    private String phone;        // Номер телефона
    private int salary;          // Зарплата
    private int age;             // Возраст

    // Конструктор класса Employee для инициализации всех полей при создании объекта
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике в консоль
    public void info() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}

// Класс Park для управления аттракционами
class Park {
    // Внутренний класс Attraction для хранения информации об одном аттракционе
    class Attraction {
        private String name;            // Название аттракциона
        private String workingHours;     // Время работы аттракциона
        private int price;               // Стоимость входа на аттракцион

        // Конструктор для инициализации полей аттракциона
        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе в консоль
        public void showInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " рублей");
            System.out.println();
        }
    }

    // Список для хранения всех аттракционов парка
    private ArrayList<Attraction> attractions = new ArrayList<>();

    // Метод для добавления нового аттракциона в парк
    public void addAttraction(String name, String workingHours, int price) {
        attractions.add(new Attraction(name, workingHours, price)); // Добавляем объект Attraction в список
    }

    // Метод для вывода информации обо всех аттракционах в парке
    public void showAttractions() {
        System.out.println("Аттракционы парка:");
        for (Attraction attraction : attractions) { // Перебираем все аттракционы в списке
            attraction.showInfo(); // Вызываем метод для отображения информации о каждом аттракционе
        }
    }
}