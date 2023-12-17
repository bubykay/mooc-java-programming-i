
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sumStatistics = new Statistics();
        Statistics sumEvenStatistics = new Statistics();
        Statistics sumOddStatistics = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int number;
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sumStatistics.addNumber(number);
            if (number % 2 == 0) {
                sumEvenStatistics.addNumber(number);
            } else {
                sumOddStatistics.addNumber(number);
            }

        }
        scanner.close();
        System.out.println("Sum: " + sumStatistics.sum());
        System.out.println("Sum of even numbers: " + sumEvenStatistics.sum());
        System.out.println("Sum of odd numbers: " + sumOddStatistics.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the
        // exercise
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        // Statistics statistics = new Statistics();
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());
        // statistics.sumOfUserInputs();

    }

}
