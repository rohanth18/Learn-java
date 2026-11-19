import java.util.*;

public class LibraryBookSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++", "SQL", "HTML"};

        System.out.println("Enter book name:");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < books.length; i++) {

            if (books[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Book Found");
        } else {
            System.out.println("Book Not Found");
        }
    }
}