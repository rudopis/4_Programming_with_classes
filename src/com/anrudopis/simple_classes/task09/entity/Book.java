package com.anrudopis.simple_classes.task09.entity;

import java.util.Objects;

/*
 *9.Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Book {
    private int bookID;
    private int publicationYear;
    private int numberOfPage;
    private double price;
    private String bookName;
    private String writer;
    private String publisher;
    private String coverType;

    public Book() {

    }

    public Book(String bookName, String writer, String publisher, int publicationYear) {
        this.bookName = bookName;
        this.writer = writer;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        if (this.getBookID() != book.getBookID() || this.getPublicationYear() != book.getPublicationYear() ||
                this.getNumberOfPage() != book.getNumberOfPage() || this.getPrice() != book.getPrice() ||
                !this.getBookName().equals(book.getBookName()) || !this.getWriter().equals(book.getWriter()) ||
                !this.getPublisher().equals(book.getPublisher()) || !this.getCoverType().equals(book.getCoverType())) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {
        return this.getBookID() + this.getPublicationYear() + Objects.hash(this.getBookName(), this.getWriter());
    }

    @Override
    public String toString() {
        return "Book '" + this.getBookName() + "' written by " + this.getWriter() + " publisher '" +
                this.getPublisher() + "' year " + this.getPublicationYear() + " price " + this.getPrice();
    }
}
