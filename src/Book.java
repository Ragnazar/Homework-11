import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final String author;
    private int yearPublishing;
    private int id;

    public Book(String bookName, Author author, int yearPublishing) {
        this.author = author.toString();
        this.bookTitle = bookName;
        this.yearPublishing = yearPublishing;
        id++;
    }

  /*  private String getAuthor() {
        return author.toString();
    }*/

    private String getBookTitle() {
        return bookTitle;
    }

    private int getYearPublishing() {
        return yearPublishing;
    }

    void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return Objects.equals(id, c2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return author + hashCode() + " | "+ getBookTitle() + " | " + getYearPublishing() + " |";
    }
}
