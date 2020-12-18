package fileIo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    // properties for this class
    // goal: read in a file and parse through it
    private String directoryName;   // i.e. 'data', 'src/fileIo'
    private String fileName;        // i.s. 'day18.txt', 'jolts.txt'
    private String logFileName;     // will hold logging info
    private Path directoryPath;     // Path representation of the parent directory for our files
    private Path filePath;          // Path representation for the actual file itself
    private Path logFilePath;       // Path representation of the log file
    private List<String> fileLines; // Holding spot for the content inside of the data file itself
    private List<String> logFile;   // Holding spot for the content inside of the log file

    public FileReader(String directoryName, String fileName, String logFileName) {
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        this.directoryPath = Paths.get(directoryName, fileName);
        this.filePath = Paths.get(fileName);
        this.logFilePath = Paths.get(logFileName);


    }

    // Getters and Setters
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFile() {
        return logFile;
    }

    public void setLogFile(List<String> logFile) {
        this.logFile = logFile;
    }
}