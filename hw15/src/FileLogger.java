import config.FileLoggerSettings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration cfg){
        this.config = cfg;
    }

    public void debug(String str){
        logImpl(LoggingLevel.DEBUG, str);
    }

    public void info(String str){
        logImpl(LoggingLevel.INFO, str);
    }

    private void logImpl(LoggingLevel level, String str){
        if (!config.isLoggingLevelAvailable(level))
            return;

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        String format = config.getFormat();
        String formattedLog = format
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_TIME_KEY, formattedDateTime)
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_LEVEL_KEY, level.toString())
                .replace(FileLoggerSettings.CONFIG_LOG_FORMAT_MESSAGE_KEY, str);

        System.out.println(formattedLog);



    }
}
