package edu.logger;

import edu.logger.config.FileLoggerSettings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {
    public void debug(String str){
        logImpl(LoggingLevel.DEBUG, str);
    }

    public void info(String str){
        logImpl(LoggingLevel.INFO, str);
    }

    protected abstract void logImpl(LoggingLevel loggingLevel, String str);

    protected String formatLog(LoggingLevel loggingLevel, String format, String logStr){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return format
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_TIME_KEY, formattedDateTime)
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_LEVEL_KEY, loggingLevel.toString())
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_MESSAGE_KEY, logStr);
    }
}
