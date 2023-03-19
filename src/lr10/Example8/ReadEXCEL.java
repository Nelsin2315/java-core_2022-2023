import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadEXCEL {
    public static void main(String[] args) throws IOException {

        String filePath = "src/lab10/example3.xlsx";
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (IOException e) {
            System.err.println("Не удалось открыть файл Excel: " + e.getMessage());
            return;
        }
    }
}