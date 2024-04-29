import config.FileLoggerSettings;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String path){
        FileLoggerConfiguration config = new FileLoggerConfiguration();

        try {
            InputStream inputStream = Main.class.getResourceAsStream(path);
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;

                while ((line = reader.readLine()) != null) {
                    parseConfigurationLine(config, line);
                }

                reader.close();
            }
            else {
                System.err.printf("File not found: %s%n", path);
            }
        }
        catch (IOException e){
            System.err.printf("Error reading file: %s%n", e.getMessage());
        }
        return config;
    }

    private void parseConfigurationLine(FileLoggerConfiguration config, String line){
        int colonIndex = line.indexOf(":");

        if (colonIndex <= 0  || line.length() < colonIndex + 1) {
            System.err.printf("Invalid config line: %s%n", line);
            return;
        }

        String key = line.substring(0, colonIndex).trim();
        String value = line.substring(colonIndex + 1).trim();

        if (key.equals(FileLoggerSettings.CONFIG_LOG_PATH_KEY)){
            config.setLogPath(value);
        }
        else if (key.equals(FileLoggerSettings.CONFIG_LOG_LEVEL_KEY)) {
            config.setLoggingLevel(LoggingLevel.valueOf(value));
        }
        else if (key.equals(FileLoggerSettings.CONFIG_LOG_FILE_MAX_SIZE_KEY)) {
            config.setMaxSizeBytes(Long.parseLong(value));
        }
        else if (key.equals(FileLoggerSettings.CONFIG_LOG_FILE_FORMAT_KEY)) {
            config.setFormat(value);
        }
        else {
            System.err.printf("Invalid config line: %s%n", line);
        }
    }
}
