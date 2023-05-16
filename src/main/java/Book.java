public class Book {
    private static String author;

    String getAuthor() {
        return this.author;
    }

    private static String title;

    String getTitle() {
        return this.title;
    }

    public static Book of(String author, String title) {
        Book book = new Book();
        System.out.println("Author:"+ author);
        System.out.println("Title: "+ title);
        return book;


    }


}

