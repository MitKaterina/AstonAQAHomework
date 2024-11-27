package HomeWork14;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTestNGTest {

    // Тест для положительного числа
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(FactorialCalculator.calculateFactorial(5), 120);  // 5! = 120
    }

    // Тест для нуля
    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);  // 0! = 1
    }

    // Тест для отрицательного числа (должен выбросить исключение)
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculateFactorial(-5);
    }
}