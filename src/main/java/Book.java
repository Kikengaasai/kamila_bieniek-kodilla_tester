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


    public static class AdvCalculator {
        public double calculate() {
            String userSelected = UserDialogs.getUserSelection();
            int a = UserDialogs.getValue();
            int b = UserDialogs.getValue();
            double result = 0;
            switch (userSelected) {
                case "ADD":
                    result= a + b;
                    break;
                case "SUB":
                    result= a - b;
                    break;
                case "DIV":
                    result= a / b;
                    break;
                case "MUL":
                    result= a * b;
                    break;
            }
            return result;
        }
    }
}

