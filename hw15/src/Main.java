import config.FileLoggerSettings;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testLogger();
    }

    private void testLogger(){
        FileLoggerConfigurationLoader logConfigLoader = new FileLoggerConfigurationLoader();

        FileLoggerConfiguration logConfig = logConfigLoader.load(FileLoggerSettings.DEFAULT_CONFIG_PATH);
        logConfig.setLoggingLevel(LoggingLevel.DEBUG);
        FileLogger fileLogger = new FileLogger(logConfig);
        fileLogger.debug("a=42");
        fileLogger.info("Starting program");
        fileLogger.debug("b=77");

    }
}