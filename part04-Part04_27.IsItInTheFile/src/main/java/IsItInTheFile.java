
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        scanner.close();

        try {
            Scanner filScanner = new Scanner(Paths.get(file));
            String lastWord = "";
            while (filScanner.hasNextLine()) {
                String name = filScanner.nextLine();
                lastWord = name;
                if (name.equals(searchedFor)) {
                    System.out.println("Found!");
                    break;
                }
            }
            if (!lastWord.equals(searchedFor)) {
                System.out.println("Not found.");
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
