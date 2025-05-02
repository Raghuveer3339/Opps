public class BookDemo {
    private String title;
    private String author;
    private int publicationYear;

    public BookDemo() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = 0;
    }

    public BookDemo(String title, String author) {
        this.title = title != null ? title : "Untitled";
        this.author = author != null ? author : "Unknown Author";
        this.publicationYear = 0;
    }

    public BookDemo(String title, String author, int publicationYear) {
        this.title = title != null ? title : "Untitled";
        this.author = author != null ? author : "Unknown Author";
        this.publicationYear = publicationYear > 0 ? publicationYear : 0;
    }

    public void displayDetails() {
        String details = "Title: " + title + ", Author: " + author;
        if (publicationYear != 0) {
            details += ", Year: " + publicationYear;
        }
        System.out.println(details);
    }

    public static void main(String[] args) {
        BookDemo book1 = new BookDemo();
        BookDemo book2 = new BookDemo("1984", "George Orwell");
        BookDemo book3 = new BookDemo("Brave New World", "Aldous Huxley", 1932);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
