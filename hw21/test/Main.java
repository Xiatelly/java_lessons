import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testExampleTest();
    }

    private void testExampleTest(){
        try {
            TestRunner.start(ExampleTest.class);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}