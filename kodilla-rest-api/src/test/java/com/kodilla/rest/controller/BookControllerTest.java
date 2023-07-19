package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        // given
        BookDto bookDto = new BookDto("Title 1", "Author 1");
        BookService bookService = mock(BookService.class);
        BookController bookController = new BookController(bookService);

        // when
        bookController.addBook(bookDto);

        // then
        verify(bookService, times(1)).addBook(any(BookDto.class));
    }
}