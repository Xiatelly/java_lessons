public class FileLoggerConfiguration extends LoggerConfiguration {
    private String logPath;
    private long maxSizeBytes = 1048576;

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public void setMaxSizeBytes(long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
    }

    public String getLogPath() {
        return logPath;
    }

    public long getMaxSizeBytes() {
        return maxSizeBytes;
    }
}
