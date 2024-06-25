package edu.logger;

public class LoggerConfiguration {
    private LoggingLevel loggingLevel = LoggingLevel.INFO;
    private  String format = "[%TIME%][%LEVEL%] Message: %MESSAGE%";

    public boolean isLoggingLevelAvailable(LoggingLevel level){
        if (this.loggingLevel == level)
            return true;

        switch (this.loggingLevel){
            case DEBUG:
                return level == LoggingLevel.INFO;
        }
        return false;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public String getFormat() {
        return format;
    }
}
