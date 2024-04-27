public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.runTest();
    }

    private void runTest(){
        TestRunner.runTestByClass(ExperimentalClassTest.class);
    }
}