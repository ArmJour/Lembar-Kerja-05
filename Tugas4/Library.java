    package Tugas4;

    import java.util.*;

    public class Library {
        private Inventory<Book> inventory;
        
        public Library() {
            this.inventory = new Inventory<>();
        }

        public void addBook(Book book) {
            inventory.addItem(book);
        }

        public boolean removeBook(Book book) {
            return inventory.removeItem(book);
        }

        public List<Book> searchBooks(String keyword) {
            return inventory.searchItem(keyword);
        }

        public void updateStock(Book book, int stock) {
            if(book != null && stock >= 0) {
                book.setStock(stock);
            }
        }

        
    }
