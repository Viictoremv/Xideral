// File: MultiCatchDemo.java
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchDemo {
    public static void riskyOperation() throws IOException, SQLException {
        if (Math.random() < 0.5) {
            throw new IOException("Disk failure");
        } else {
            throw new SQLException("DB unavailable");
        }
    }

    public static void main(String[] args) {
        try {
            riskyOperation();
        } catch (IOException | SQLException ex) {
            System.err.println("Error occurred: " + ex.getClass().getSimpleName() + " – " + ex.getMessage());
        }
    }
}