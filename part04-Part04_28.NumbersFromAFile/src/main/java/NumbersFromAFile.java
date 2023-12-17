
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        Integer count = 0;
        System.out.println("sdfas");

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));

            while (fileScanner.hasNextLine()) {
                int num = Integer.valueOf(fileScanner.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    count += 1;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();

        System.out.println("Numbers: " + count);

    }

}
