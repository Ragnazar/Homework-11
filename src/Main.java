public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Jack", "London");

        Book book = new Book("Capitan's daughter", author1, 1998);
        Book book2 = new Book("Call of the wild", author2, 1950);

        book.setYearPublishing(1957);
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(author1.equals(author2));
    }
}