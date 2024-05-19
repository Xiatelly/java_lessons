import java.io.*;
import java.nio.file.Path;
import java.util.Date;

public class TestResultParser {
    public TestResult parse(String filePath){
        return parse(new File(filePath));
    }

    public TestResult parse(Path filePath){
        return parse(new File(filePath.toString()));
    }

    public TestResult parse(File file){
        TestResult result = new TestResult();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;

            while ((line = reader.readLine()) != null) {
                parseConfigurationLine(result, line);
            }
            result.timeTests = new Date(file.lastModified());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private void parseConfigurationLine(TestResult result, String line){
        int colonIndex = line.indexOf(":");

        if (colonIndex <= 0  || line.length() < colonIndex + 1) {
            return;
        }

        String key = line.substring(0, colonIndex).trim();
        String value = line.substring(colonIndex + 1).trim();

        switch (key) {
            case TestRunnerConfig.LOG_TESTS_RUN_KEY:
                result.totalTests = Integer.parseInt(value);
                break;
            case TestRunnerConfig.LOG_TESTS_FAILURES_KEY:
                result.failedTests = Integer.parseInt(value);
                result.succeededTests = result.totalTests - result.failedTests;
                break;
        }
    }
}
