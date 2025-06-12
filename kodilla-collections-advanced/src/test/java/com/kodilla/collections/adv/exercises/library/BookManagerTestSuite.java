package com.kodilla.collections.adv.exercises.library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTestSuite {

    @Test
    public void findBooksByAuthor(){
        BookManager bookManager = new BookManager();
        List<Book> books = bookManager.findBooksByAuthor("Henryk Sienkiewicz");
        assertEquals(1, books.size());

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("Krzyżacy", "Henryk Sienkiewicz", 1950));
        assertEquals(books, expectedList);

    }

    @Test
    public void findBooksPublishedAfter(){
        BookManager bookManager = new BookManager();
        List<Book> books = bookManager.findBooksPublishedAfter(1950);
        assertEquals(3, books.size());

        List<Book> expectedList = new ArrayList<>();
        expectedList.add(new Book("Ślepnąc od świateł", "Jakub Żulewski", 2015));
        expectedList.add(new Book("Szpila", "Artur Szpilka", 2024));
        expectedList.add(new Book("Mały Książe", "Antonine de Saint Exupery", 2001));
        assertEquals(books, expectedList);


    }

}