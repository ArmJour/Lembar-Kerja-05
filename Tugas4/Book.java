package Tugas4;

public class Book {
    private String title;
    private String author;
    private int year;
    private int stock;

    public Book() {
    }

    public Book(String title, String author, int year, int stock) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        return "title = " + title +
                ", author = " + author +
                ", year = " + year +
                ", stock = " + stock;
    }
}
