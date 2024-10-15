import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }
    @Test
    public void testMultiNumbers() {
        assertEquals(6, StringCalculator.add("1,5"));
    }

}
