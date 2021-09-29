package com.anrudopis.simple_classes.task08.main;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервал
 */

import com.anrudopis.simple_classes.task08.entity.Customer;
import com.anrudopis.simple_classes.task08.entity.CustomerList;
import com.anrudopis.simple_classes.task08.logic.CustomerLogic;
import com.anrudopis.simple_classes.task08.view.CustomerView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerList list = new CustomerList();
        CustomerLogic logic = CustomerLogic.getInstance();
        CustomerView view = CustomerView.getInstance();
        Customer customer1 = new Customer("Рудопис", "Игорь", "Васильевич");
        Customer customer2 = new Customer("Иванов", "Сергей", "Иванович");
        Customer customer3 = new Customer("Иванов", "Рудольф", "Иванович");
        List<Customer> customersByCard = new ArrayList<>();

        customer1.setCreditCardNumber(287);
        customer2.setCreditCardNumber(390);
        customer3.setCreditCardNumber(890);

        list.addCustomer(customer1);
        list.addCustomer(customer2);
        list.addCustomer(customer3);

        System.out.println("Список клиентов:");
        view.print(list.getCustomers());

        logic.sortByName(list.getCustomers());

        System.out.println("Список клиентов после сортировки:");
        view.print(list.getCustomers());

        System.out.println("Список клиентов с номерами карт 200 - 500: ");
        view.print(logic.sortByCreditCardNumber(list.getCustomers(), 200, 500));
    }
}
