package Tugas4;

import java.util.*;

public class AppRun {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Clean Code", "Robert C. Martin", 2008, 10));
        library.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt", 1999, 5));
        library.addBook(new Book("Design Patterns", "Erich Gamma", 1994, 8));
        library.addBook(new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009, 12));
        library.addBook(new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell", 2010, 7));

        System.out.println("============================================");
        System.out.println("Welcome to FILKOM's Library");
        System.out.println("============================================");

        Scanner sc = new Scanner(System.in);
        int n;

        while(true) {
            System.out.println("============================================");
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Books");
            System.out.println("4. Update Stock");
            System.out.println("5. View All Books");
            System.out.println("6. Exit");
            System.out.println("============================================");
            System.out.printf("%-28s: ","Enter your choice");
            n = sc.nextInt(); sc.nextLine();

            switch (n) {
                case(1) -> {
                    System.out.print("Enter title: "); String title = sc.nextLine();
                    System.out.print("Enter author: "); String author = sc.nextLine();
                    System.out.print("Enter realese year: "); int year = sc.nextInt();
                    System.out.print("Enter book stock: "); int stock = sc.nextInt();
                    if(sc.hasNextLine()) sc.nextLine();
                    library.addBook(new Book(title, author, year, stock));
                    System.out.println("Book added successfully!");
                }
                case(2) -> {
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = sc.nextLine();
                    List<Book> foundBooks = library.searchBooks(removeTitle);
                    if (!foundBooks.isEmpty()) {
                        library.removeBook(foundBooks.get(0));
                        System.out.println("Book has been removed");
                    } else {
                        System.out.println("Book was not found");
                    }
                }
                case(3) -> {
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    List<Book> searchResults = library.searchBooks(keyword);
                    if (!searchResults.isEmpty()) {
                        for (Book book : searchResults) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("No books found!");
                    }
                }
                case(4) -> {
                    System.out.print("Enter book title to update stock: ");
                    String updateTitle = sc.nextLine();
                    List<Book> booksToUpdate = library.searchBooks(updateTitle);
                    if (!booksToUpdate.isEmpty()) {
                        System.out.print("Enter new stock quantity: ");
                        int newStock = sc.nextInt();
                        library.updateStock(booksToUpdate.get(0), newStock);
                        System.out.println("Stock updated successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                }
                case(5) -> {
                    List<Book> allBooks = library.searchBooks("");
                    if (!allBooks.isEmpty()) {
                        for (Book book : allBooks) {
                            System.out.println(book);
                        }
                    } else {
                        System.out.println("No books available!");
                    }
                }
                case(6) -> {
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                }
            }

        }
    }
}
