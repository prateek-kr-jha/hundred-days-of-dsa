public class LogLevels {
    
    public static String message(String logLine) {
       return (logLine.split(":"))[1].strip();
        
    }

    public static String logLevel(String logLine) {
       String error = (logLine.split(":"))[0];
       return error.substring(1, error.length() - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
