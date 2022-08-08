import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;
    private static int count = 0;
    private final int id;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        id = count++;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return Objects.equals(id, c2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public  String toString() {
        return hashCode() + " | " + getAuthorName()  + " " + getAuthorSurname() + " | ";
    }


}
