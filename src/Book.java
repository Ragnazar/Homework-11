import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearPublishing;




    public Book(String title, Author author, int yearPublishing) {
        this.author = author;
        this.title = title;
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return Objects.equals(title, c2.title);
    }

    @Override
    public String toString() {
        return author.toString() + " | "+ getTitle() + " | " + getYearPublishing() + " |";
    }

    @Override
    public int hashCode() {
        return Objects.hash(author.toString(), title);
    }
}
