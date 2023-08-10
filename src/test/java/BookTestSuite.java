import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {
    @Test
    void testGetAuthor() {
        Book book = new Book("John Smith", "The Great Gatsby");
        assertEquals("John Smith", book.getAuthor());
    }

    @Test
    void testGetTitle() {
        Book book = new Book("John Smith", "The Great Gatsby");
        assertEquals("The Great Gatsby", book.getTitle());
    }

    @Test
    void testOf() {
        Book book = Book.of("John Smith", "The Great Gatsby");
        assertEquals("John Smith", book.getAuthor());
        assertEquals("The Great Gatsby", book.getTitle());
    }

}