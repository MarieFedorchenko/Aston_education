import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFactorial {

    @Test
    public void testPositiveNumber() {
        assertEquals(24, Factorial.calculateFactorial(4));
    }

    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
    }

    @Test
    public void testNumberOne() {
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    public void testNumberZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(479001600, Factorial.calculateFactorial(12));
    }

}
