package com.anrudopis.simple_classes.task09.entity;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books = new ArrayList<>();

    public BookList(){

    }

    public BookList(List<Book> books){
        this.books = books;
    }

    //возвращает список книг
    public List<Book> getBooks(){
        return books;
    }

    //возвращает часть списка книг в заданном интервале порядковых номеров
    public List<Book> getBooks(int fromIndex, int toIndex){
        return books.subList(fromIndex, toIndex);
    }

    //возвращает книгу из писка по указанному порядковому номеру в списке
    public Book getBook(int index){
        return books.get(index);
    }

    //добавляет список книг
    public void addBookList(List<Book> books){
        this.books.addAll(books);
    }

    //добавляет новую книги в конец списка
    public void addBook(Book book){
        this.books.add(book);
    }

    //добавляет книгу в список на указанную позицию со сдвигом оставшейся части списка вниз на 1
    public void addBook(int index, Book book){
        this.books.add(index, book);
    }

}
