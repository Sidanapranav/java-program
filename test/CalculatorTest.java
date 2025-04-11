import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(4, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });                                                            
        assertEquals("Division by zero not allowed", exception.getMessage());
    }
}
