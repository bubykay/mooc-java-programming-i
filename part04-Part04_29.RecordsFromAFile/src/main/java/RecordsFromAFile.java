
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {
                String[] info = fileScanner.nextLine().split(",");

                System.out.println(info[0] + ", age: " + info[1] + " years");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();

    }
}
