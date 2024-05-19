import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFunctionsTest {

    @Test
    public void testArrayFetchNumbersAfterLastFour0(){
        List<Integer> inArray = Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1, 7);
        List<Integer> outArray = TaskFunctions.arrayFetchNumbersAfterLastFour(inArray);
        assertEquals(Arrays.asList(1,7), outArray);
    }

    @Test
    public void testArrayFetchNumbersAfterLastFour1(){
        assertThrows(RuntimeException.class, () -> {
           List<Integer> inArray = Arrays.asList(1, 2, 5, 5, 2, 3, 5, 1, 7);
           TaskFunctions.arrayFetchNumbersAfterLastFour(inArray);
        });
    }

    @Test
    public void testArrayContainsFromOneAndFour0(){
        List<Integer> testArray0 = Arrays.asList(1, 1, 1, 4, 4, 4, 4, 1, 4);
        assertTrue(TaskFunctions.arrayContainsFromOneAndFour(testArray0));
    }

    @Test
    public void testArrayContainsFromOneAndFour1(){
        List<Integer> testArray1 = Arrays.asList(1, 7, 4, 4, 1, 1, 4, 1, 1);
        assertFalse(TaskFunctions.arrayContainsFromOneAndFour(testArray1));
    }

    @Test
    public void testArrayContainsFromOneAndFour2(){
        List<Integer> testArray2 = Arrays.asList(1, 1, 1, 1, 1);
        assertFalse(TaskFunctions.arrayContainsFromOneAndFour(testArray2));
    }

    @Test
    public void testArrayContainsFromOneAndFour3(){
        List<Integer> testArray3 = Arrays.asList(4, 4, 4, 4, 4);
        assertFalse(TaskFunctions.arrayContainsFromOneAndFour(testArray3));
    }
}