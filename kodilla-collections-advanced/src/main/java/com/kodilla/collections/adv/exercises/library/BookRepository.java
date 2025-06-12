package com.kodilla.collections.adv.exercises.library;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public static List<Book> getBooks(){
        List <Book> books = new ArrayList<>();
        books.add(new Book("Ślepnąc od świateł", "Jakub Żulewski", 2015));
        books.add(new Book("Szpila", "Artur Szpilka", 2024));
        books.add(new Book("Lalka", "Bolesław Prus", 1950));
        books.add(new Book("Mały Książe", "Antonine de Saint Exupery", 2001));
        books.add(new Book("Krzyżacy", "Henryk Sienkiewicz", 1950));

        return books;
    }
}
