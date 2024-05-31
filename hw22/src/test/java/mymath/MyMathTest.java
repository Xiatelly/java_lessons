package mymath;

import junit.framework.TestCase;

public class MyMathTest extends TestCase {

    public void testSqrt() {
        assertEquals(2.0, MyMath.sqrt(4.0));
    }

    public void testMax() {
        assertEquals(4, MyMath.max(1, 4));
    }

    public void testMin() {
        assertEquals(3, MyMath.min(3, 6));
    }
}