package com.kodilla.collections.adv.exercises.library;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public List<Book> findBooksByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for(Book books : BookRepository.getBooks()){
            if(books.getAuthor().equalsIgnoreCase(author)){
                result.add(books);
            }
        }
        return result;
    }

    public List<Book> findBooksPublishedAfter(int year){
        List<Book> result = new ArrayList<>();
        for(Book book : BookRepository.getBooks()){
            if(book.getYear() > year){
                result.add(book);
            }
        }
        return result;
    }
}
