
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.nextLine();
            if ("end".equals(number)) {
                break;
            }
            int intNumber = Integer.valueOf(number);

            System.out.println(intNumber * intNumber * intNumber);
        }
        scanner.close();

    }
}
