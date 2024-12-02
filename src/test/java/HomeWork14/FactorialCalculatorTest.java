package HomeWork14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FactorialCalculatorTest {

    @DisplayName("Тестирование вычисления факториала для положительных чисел")
    @Test
    public void testFactorialOfPositiveNumber() {
        // Проверка факториала для положительного числа
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @DisplayName("Тестирование факториала для нуля")
    @Test
    public void testFactorialOfZero() {
        // Проверка факториала для нуля (должно быть 1)
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @DisplayName("Тестирование вычисления факториала исключения для отрицательного числа ")
    @Test
    public void testFactorialOfNegativeNumber() {
        // Проверка факториала для отрицательного числа (должно выбросить исключение)
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }

}
