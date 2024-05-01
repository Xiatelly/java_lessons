import config.FileLoggerSettings;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testFileLogger();
        main.testStdoutLogger();
    }

    private void testFileLogger(){
        FileLoggerConfigurationLoader logConfigLoader = new FileLoggerConfigurationLoader();

        FileLoggerConfiguration logConfig = logConfigLoader.load(FileLoggerSettings.DEFAULT_CONFIG_PATH);
        testLogger(new FileLogger(logConfig));
    }

    private void testStdoutLogger(){
        StdoutLoggerConfiguration logConfig = new StdoutLoggerConfiguration();
        testLogger(new StdoutLogger(logConfig));
    }

    private void testLogger(Logger logger){
        logger.info("Starting program");

        for (int i = 0; i < 20; i++){
            logger.debug(String.format("i = %d", i));
            logger.info("Processing data...");
        }

        logger.info("Closing program");
    }
}