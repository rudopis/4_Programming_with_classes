package com.anrudopis.simple_classes.task09.view;

import com.anrudopis.simple_classes.task09.entity.Book;

import java.util.List;

public class BookView {

    private static final BookView instance = new BookView();

    private BookView() {

    }

    public static BookView getInstance() {
        return instance;
    }

    public void printBook(Book book) {
        System.out.println(book.toString());
    }

    public void printBookList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
