import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Math.sqrt(4.0), 0.001);
        assertEquals(0.0, Math.sqrt(0.0), 0.001);
        assertEquals(Double.NaN, Math.sqrt(-1.0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(24, ScientificCalculator.factorial(4));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Math.log(1.0), 0.001);
        assertEquals(1.0, Math.log(Math.E), 0.001);
        assertEquals(Double.NaN, Math.log(-1.0), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(16.0, Math.pow(2.0, 4.0), 0.001);
        assertEquals(1.0, Math.pow(0.0, 0.0), 0.001);
        assertEquals(Double.NaN, Math.pow(-1.0, 0.5), 0.001);
    }
}
