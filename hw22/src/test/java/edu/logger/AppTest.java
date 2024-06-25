package edu.logger;

import edu.logger.config.FileLoggerSettings;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
    extends TestCase
{
    public void testFileLogger(){
    FileLoggerConfigurationLoader logConfigLoader = new FileLoggerConfigurationLoader();

    FileLoggerConfiguration logConfig = logConfigLoader.load(FileLoggerSettings.DEFAULT_CONFIG_PATH);
    testLogger(new FileLogger(logConfig));
}

    public void testStdoutLogger(){
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
