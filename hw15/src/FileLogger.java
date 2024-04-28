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


        System.out.printf("[ %s ][ %s ] Message: %s%n", formattedDateTime, level.toString(), str);
    }
}
