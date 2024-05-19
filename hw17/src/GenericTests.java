import java.util.Arrays;
import java.util.List;

public final class GenericTests {
    private GenericTests(){}

    public static <T> List<T> toList(T[] array){
        return Arrays.asList(array);
    }

}
