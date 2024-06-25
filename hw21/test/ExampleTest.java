public class ExampleTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Starting example tests...");
    }

    private void assertEquals(int expected, int actual){
        if (actual == expected)
            System.out.println("Test passed.");
        else
            System.err.printf("Test failed: expected = %d, actual = %d%n", expected, actual);
    }

    @Test(priority = 9)
    public void testSum(){
        System.out.println("Test sum");
        Example example = new Example(7, 4);
        assertEquals(11, example.calculateSum());
    }

    @Test(priority = 1)
    public void testMultiplication(){
        System.out.println("Test multiplication");
        Example example = new Example(6, 7);
        assertEquals(42, example.calculateMultiplication());
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Tests are finished.");
    }
}