import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication Year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));

        }
        System.out.println();
        System.out.print("What information will be printed? ");

        String infoToPrint = scanner.nextLine();
        scanner.close();

        for (Book book : books) {
            if ("everything".equals(infoToPrint)) {
                System.out.println(book);
            }
            if ("name".equals(infoToPrint)) {
                System.out.println(book.getTitle());
            }
        }

    }
}
