

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testLogger();
    }

    private void testLogger(){
        FileLoggerConfiguration logConfig = new FileLoggerConfiguration();
        logConfig.setLoggingLevel(LoggingLevel.DEBUG);
        FileLogger fileLogger = new FileLogger(logConfig);
        fileLogger.debug("a=42");
        fileLogger.info("Starting program");
        fileLogger.debug("b=77");

    }
}