import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathLibraryTest {
    @Test
    public void checkAddTwoAndTwo(){
        SimpleMathLibrary library = new SimpleMathLibrary();
        assertEquals(4.0, library.add(2.0, 2.0));
    }

    @Test
    public void checkAddFiveAndTwo(){
        SimpleMathLibrary library = new SimpleMathLibrary();
        assertEquals(7.0, library.add(5.0, 2.0));
    }

    @Test
    public void checkMinusTenAndOne(){
        SimpleMathLibrary library = new SimpleMathLibrary();
        assertEquals(9.0, library.minus(10.0, 1.0));
    }

    @Test
    public void checkMinusTenAndTwelve(){
        SimpleMathLibrary library = new SimpleMathLibrary();
        assertEquals(-2.0, library.minus(10.0, 12.0));
    }
}