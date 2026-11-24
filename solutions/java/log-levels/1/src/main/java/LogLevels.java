public class LogLevels {
    
    public static String message(String logLine) {
        String [] cleaned = logLine.split(":");
        return cleaned[1].trim();    
    }

    public static String logLevel(String logLine) {
        String [] cleaned = logLine.split(":");
        return cleaned[0].toLowerCase().replace('[', ' ').replace(']', ' ').trim();  
    }

    public static String reformat(String logLine) {
         StringBuilder sb = new StringBuilder();
         sb.append(message(logLine));
         
         sb.append(" (" + logLevel(logLine) + ")");
        return sb.toString();
    }
}
