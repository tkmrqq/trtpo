import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import demo.parallel.Complex;

public class ComplexTest {
    @Test
    public void testAddition() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex result = a.plus(b);

        assertEquals(3.0, result.getRe(), 0.001);
        assertEquals(3.0, result.getIm(), 0.001);
    }

    @Test
    public void testSubtraction() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(2, 2);
        Complex result = a.minus(b);

        assertEquals(3.0, result.getRe(), 0.001);
        assertEquals(3.0, result.getIm(), 0.001);
    }

    @Test
    public void testMultiplication() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        Complex result = a.times(b);

        assertEquals(0.0, result.getRe(), 0.001);
        assertEquals(4.0, result.getIm(), 0.001);
    }

    @Test
    public void testDivision() {
        Complex a = new Complex(4, 4);
        Complex b = new Complex(2, 2);
        Complex result = a.divide(b);

        assertEquals(2.0, result.getRe(), 0.001);
        assertEquals(0.0, result.getIm(), 0.001);
    }

    @Test
    public void testModulus() {
        Complex a = new Complex(3, 4);
        double modulus = a.modulus();

        assertEquals(5.0, modulus, 0.001);
    }
}
