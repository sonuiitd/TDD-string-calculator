import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testMultiNumbers() {
        assertEquals(6, StringCalculator.add("1,5"));
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("1,-2,3");
        });
        assertEquals("Negative numbers not allowed: -2", exception.getMessage());
    }
}
