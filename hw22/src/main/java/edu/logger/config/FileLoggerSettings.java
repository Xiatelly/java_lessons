package edu.logger.config;

public final class FileLoggerSettings {
    private FileLoggerSettings(){}

    public final static String DEFAULT_CONFIG_PATH = "config.txt";

    public final static String CONFIG_LOG_PATH_KEY = "FILE";
    public final static String CONFIG_LOG_LEVEL_KEY = "LEVEL";
    public final static String CONFIG_LOG_FILE_MAX_SIZE_KEY = "MAX-SIZE";
    public final static String CONFIG_LOG_FILE_FORMAT_KEY = "FORMAT";

    public final static String CONFIG_LOG_FORMAT_TIME_KEY = "%TIME%";
    public final static String CONFIG_LOG_FORMAT_LEVEL_KEY = "%LEVEL%";
    public final static String CONFIG_LOG_FORMAT_MESSAGE_KEY = "%MESSAGE%";
}
