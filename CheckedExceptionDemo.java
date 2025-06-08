import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static String readFirstLine(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        return reader.readLine();
    }

    public static void main(String[] args) {
        try {
            String line = readFirstLine("nonexistent.txt");
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
