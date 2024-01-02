
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        Integer count = 0;
        Integer wins = 0;
        Integer losses = 0;
        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()) {
                String[] fixture = fileScanner.nextLine().split(",");
                Game game = new Game(fixture[0], fixture[1], Integer.valueOf(fixture[2]), Integer.valueOf(fixture[3]));
                if (teamName.equals(fixture[0]) || teamName.equals(fixture[1])) {
                    count += 1;
                    if (game.getWinner().equals(teamName)) {
                        wins += 1;
                    } else if (game.getLoser().equals(teamName)) {
                        losses += 1;
                    }

                }

            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
