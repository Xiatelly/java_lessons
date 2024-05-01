import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.FileWriter;
import java.io.IOException;

public final class TestRunner {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();

        testRunner.runTests(SimpleMathLibraryTest.class, TaskFunctionsTest.class);
        System.out.println();

        testRunner.runTest("SimpleMathLibraryTest");
        System.out.println();

        testRunner.testParser();
    }

    private void runTest(Class<?> testClass) {
        long startTime = System.nanoTime();
        Result result = JUnitCore.runClasses(testClass);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        printResult(testClass, result, elapsedTime);
    }

    private void runTests(Class<?>... testClasses) {
        for (Class<?> testClass : testClasses)
            runTest(testClass);
    }

    private void runTest(String testClassName) {
        try {
            Class<?> testClass = Class.forName(testClassName);
            runTest(testClass);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void runTests(String... testClassNames) {
        try {
            for (String testClassName : testClassNames) {
                Class<?> testClass = Class.forName(testClassName);
                runTest(testClass);
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void printResult(Class<?> testClass, Result result, long elapsedTime) {
        StringBuilder logBuilder = new StringBuilder();
        logBuilder
                .append(String.format("Test summary for (%s) for %dms :%n", testClass.getName(), elapsedTime / 1000000L))
                .append(String.format("%s: %d%n", TestRunnerConfig.LOG_TESTS_RUN_KEY, result.getRunCount()))
                .append(String.format("%s: %d%n", TestRunnerConfig.LOG_TESTS_FAILURES_KEY, result.getFailureCount()))
                .append(String.format("%s: %d%n", TestRunnerConfig.LOG_TESTS_IGNORED_KEY, result.getIgnoreCount()));

        String log = logBuilder.toString();
        System.out.println(log);

        try {
            FileWriter logWriter = new FileWriter(String.format("%s.txt", testClass.getName()));
            logWriter.write(log);
            logWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Failure failure : result.getFailures()) {
            System.err.printf("Test Failure for (%s):%n", testClass.getName());
            System.err.println("Test Description: " + failure.getDescription());
            System.err.println("Exception Message: " + failure.getMessage());
            System.err.println("Stack Trace:");
            System.err.println(failure.getTrace());
            System.err.println();
        }
    }

    private void testParser(){
        TestResultParser testResultParser = new TestResultParser();
        TestResult result = testResultParser.parse("SimpleMathLibraryTest.txt");
        System.out.printf("Tests run: %d%n", result.totalTests);
        System.out.printf("Tests failures: %d%n", result.failedTests);
        System.out.printf("Tests succeeded: %d%n", result.succeededTests);
        System.out.printf("Tests time: %s%n", result.timeTests);
    }
}
