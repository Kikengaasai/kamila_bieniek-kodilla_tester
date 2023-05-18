public class Book {
    private String author;

    String getAuthor() {
        return this.author;
    }

    private String title;

    String getTitle() {
        return this.title;
    }

    public static Book of() {
        Book book = new Book();
        String author = book.getAuthor();
        String title = book.getTitle();

        System.out.println("Author:"+ author);
        System.out.println("Title: "+ title);
        return book;


    }


}

