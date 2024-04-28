public class FileLoggerConfiguration {
    private String logPath;
    private LoggingLevel loggingLevel = LoggingLevel.DEBUG;
    private long maxSizeBytes = 1048576;


    public boolean isLoggingLevelAvailable(LoggingLevel level){
        if (this.loggingLevel == level)
            return true;

        switch (this.loggingLevel){
            case DEBUG:
                return level == LoggingLevel.INFO;
        }
        return false;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public void setMaxSizeBytes(long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
    }

    public String getLogPath() {
        return logPath;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxSizeBytes() {
        return maxSizeBytes;
    }
}
