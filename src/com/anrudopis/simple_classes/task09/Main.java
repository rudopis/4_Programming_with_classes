package com.anrudopis.simple_classes.task09;

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

import com.anrudopis.simple_classes.task09.entity.Book;
import com.anrudopis.simple_classes.task09.entity.BookList;
import com.anrudopis.simple_classes.task09.logic.BookLogic;
import com.anrudopis.simple_classes.task09.view.BookView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Гиперион", "Дэн Симмонс", "Риполфикшн", 2001);
        Book book2 = new Book("Джек из тени", "Роджер Желязны", "Эксмо", 2010);
        Book book3 = new Book("Падение Гипериона", "Дэн Симмонс", "Риполфикшн", 2005);
        Book book4 = new Book("Вторая жизнь Уве", "Фредерик Бакман", "Риполфикшн", 2017);

        BookList bookList = new BookList();
        BookView view = BookView.getInstance();
        BookLogic logic = BookLogic.getInstance();

        List<Book> booksByWriter = new ArrayList<>();
        List<Book> booksByPublisher= new ArrayList<>();
        List<Book> booksByYear = new ArrayList<>();

        String writer = "Дэн Симмонс";
        String publisher = "Риполфикшн";
        int year = 2005;

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        bookList.addBook(book4);

        //выводим первоначальный список книг на консоль
        view.printBookList(bookList.getBooks());

        booksByWriter = logic.findBookByWriter(bookList.getBooks(), writer);
        System.out.println("Спсиок книг автора " + writer + " :");
        view.printBookList(booksByWriter);

        booksByPublisher = logic.findBookByPublisher(bookList.getBooks(), publisher);
        System.out.println("Спсиок книг издаьельства " + publisher + " :");
        view.printBookList(booksByPublisher);

        booksByYear = logic.findBookByYear(bookList.getBooks(), year);
        System.out.println("Спсиок книг, изданных позже " + year + " года:");
        view.printBookList(booksByYear);


    }
}
