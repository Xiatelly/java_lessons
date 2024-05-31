package edu.logger;

public class StdoutLogger extends Logger{
    private final StdoutLoggerConfiguration config;

    public StdoutLogger(StdoutLoggerConfiguration config) {
        this.config = config;
    }

    @Override
    protected void logImpl(LoggingLevel level, String str) {
        if (!config.isLoggingLevelAvailable(level))
            return;
        String formattedLog = formatLog(level, config.getFormat(), str);
        System.out.println(formattedLog);
    }
}
