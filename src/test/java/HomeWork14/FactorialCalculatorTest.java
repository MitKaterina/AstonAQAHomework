package HomeWork14;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testFactorialOfPositiveNumber() {
        // Проверка факториала для положительного числа
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    void testFactorialOfZero() {
        // Проверка факториала для нуля (должно быть 1)
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        // Проверка факториала для отрицательного числа (должно выбросить исключение)
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-5));
    }
}
