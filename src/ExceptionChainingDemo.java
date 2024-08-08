import java.io.*;

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingDemo {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent.txt");
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }

    public static void readFromFile(String filename) throws CustomException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            // Read from the file (not implemented for demonstration purposes)
            reader.close();
        } catch (IOException ioException) {
            throw new CustomException("Error reading file: " + filename, ioException);
        }
    }
}
