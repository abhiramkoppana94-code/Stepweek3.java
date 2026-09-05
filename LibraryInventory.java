import java.util.Scanner;

class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void printEntry() {
        System.out.println(title + " by " + author + " - "
                + copiesAvailable + " copies available");
    }
}

public class LibraryInventory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookInventory[] books = new BookInventory[4];

        for (int i = 0; i < books.length; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(",");

            String title = data[0].trim();
            String author = data[1].trim();
            int copiesAvailable = Integer.parseInt(data[2].trim());

            books[i] = new BookInventory(title, author, copiesAvailable);
        }

        for (BookInventory book : books) {
            book.printEntry();
        }

        scanner.close();
    }
}