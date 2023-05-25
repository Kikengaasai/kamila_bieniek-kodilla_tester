public class Book {
    private String author;

    String getAuthor() {
        return this.author;
    }

    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;


    }


}

