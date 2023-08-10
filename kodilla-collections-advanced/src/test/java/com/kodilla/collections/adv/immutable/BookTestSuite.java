package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.homework.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {
    @Test
    public void testGetAuthor() {
        // given
        String expectedAuthor = "John Doe";
        String title = "The Great Gatsby";

        // when
        Book book = new Book(expectedAuthor, title);
        String actualAuthor = book.getAuthor();

        // then
        assertEquals(expectedAuthor, actualAuthor);
    }

    @Test
    public void testGetTitle() {
        // given
        String author = "Jane Smith";
        String expectedTitle = "Pride and Prejudice";

        // when
        Book book = new Book(author, expectedTitle);
        String actualTitle = book.getTitle();

        // then
        assertEquals(expectedTitle, actualTitle);
    }


}