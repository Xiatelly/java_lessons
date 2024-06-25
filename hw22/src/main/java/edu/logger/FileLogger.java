package edu.logger;

import edu.logger.config.FileLoggerSettings;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger extends Logger{
    private final FileLoggerConfiguration config;
    private FileWriter logWriter;
    private String logFileFullPath;

    public FileLogger(FileLoggerConfiguration cfg){
        this.config = cfg;
        openNewLogWriter();
    }

    private void openNewLogWriter(){
        if (logWriter != null){
            try {
                logWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("-yyyy-MM-dd-HH-mm-ss-SSS");
        String formattedDateTime = currentDateTime.format(formatter);

        StringBuilder logFileFullPathBuilder = new StringBuilder();

        logFileFullPath = config.getLogPath();
        int dotIndex = logFileFullPath.lastIndexOf('.');
        if (dotIndex != -1) {
            String pathFirstPart = logFileFullPath.substring(0, dotIndex);
            String fileExtension = logFileFullPath.substring(dotIndex + 1);

            logFileFullPath = logFileFullPathBuilder
                    .append(pathFirstPart)
                    .append(formattedDateTime)
                    .append('.')
                    .append(fileExtension)
                    .toString();
        }
        else {
            logFileFullPath = logFileFullPathBuilder
                    .append(logFileFullPath)
                    .append(formattedDateTime)
                    .toString();
        }

        Path directoryPath = Paths.get(logFileFullPath).getParent();
        try {
            Files.createDirectories(directoryPath);
            logWriter = new FileWriter(logFileFullPath, true);
        }
        catch (IOException e) {
            System.err.printf("Failed to open log file %s%n", e.getMessage());
        }
    }

    @Override
    protected void logImpl(LoggingLevel level, String str){
        if (!config.isLoggingLevelAvailable(level))
            return;

        if (logWriter != null){
            String formattedLog = formatLog(level, config.getFormat(), str);

            try {
                logWriter.write(formattedLog);
                logWriter.write("\n");
                logWriter.flush();
                Path path = Paths.get(logFileFullPath);
                long fileSize = Files.size(path);
                if (fileSize >= config.getMaxSizeBytes()){
                    openNewLogWriter();
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
