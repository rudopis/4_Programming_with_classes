package com.anrudopis.simple_classes.task09.logic;

import com.anrudopis.simple_classes.task09.entity.Book;
import java.util.ArrayList;
import java.util.List;

/*
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class BookLogic {

    private final static BookLogic instance = new BookLogic();

    private BookLogic(){

    }

    public static BookLogic getInstance(){
        return instance;
    }

    public List<Book> findBookByWriter(List<Book> books, String writer) {
        List<Book> writerBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getWriter().equals(writer)) {
                writerBooks.add(book);
            }
        }

        return writerBooks;
    }

    public List<Book> findBookByPublisher(List<Book> books, String publisher) {
        List<Book> publisherBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                publisherBooks.add(book);
            }
        }

        return publisherBooks;
    }

    public List<Book> findBookByYear(List<Book> books, int year) {
        List<Book> yearBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() > year) {
                yearBooks.add(book);
            }
        }

        return yearBooks;
    }

}
