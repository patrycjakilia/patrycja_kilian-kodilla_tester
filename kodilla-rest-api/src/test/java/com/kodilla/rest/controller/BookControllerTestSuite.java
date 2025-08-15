package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestSuite {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title1", "Author1"));
        bookList.add(new BookDto("Title2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBooks(){
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        BookDto newBook = new BookDto("Title1", "Author1");

        Mockito.doNothing().when(bookServiceMock).addBook(Mockito.any(BookDto.class));

        //when
        bookController.addBook(newBook);

        //then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(Mockito.any(BookDto.class));
    }

}