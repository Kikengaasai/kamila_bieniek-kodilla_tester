public class checkBook {

    public static void main(String[] args) {
        Book book = Book.of("Jacek Piekara", "Ja, Inkwizytor");
        System.out.println("Author: "+ book.getAuthor() + "\nTitle: " + book.getTitle());

    }
}
