import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactorial {

    @Test
    public void testPositiveNumber() {
        Factorial factorial = new Factorial();
        assertEquals(24, factorial.calculateFactorial(4));
    }

    @Test
    public void testNegativeNumber() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.calculateFactorial(-1);
        });
    }

    @Test
    public void testNumberOne() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    public void testNumberZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    public void testLargeNumber() {
        Factorial factorial = new Factorial();
        assertEquals(479001600, factorial.calculateFactorial(12));
    }

}
