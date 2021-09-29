package com.anrudopis.simple_classes.task08.entity;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 */

public class CustomerList {
    private List<Customer> customers = new ArrayList<>();

    public CustomerList() {

    }

    public CustomerList(List<Customer> customers) {
        this.customers = customers;
    }

    //возвращает список клиентов
    public List<Customer> getCustomers() {
        return customers;
    }

    //возвращает часть списка клиентов из списка в указанном диапазоне индексов
    public List<Customer> getCustomers(int firstIndex, int lastIndex) {
        return customers.subList(firstIndex, lastIndex);
    }

    //возвращает клиента по его индексу в списке
    public Customer getCustomerByIndex(int index) {
        return customers.get(index);
    }

    //добавляет список клиентов
    public void addCustomers(List<Customer> customers) {
        this.customers.addAll(customers);
    }

    //добавляет клиента в конец списка
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    //добавляет клиента в список на указанную позицию со сдвигом остальной части списка на один вниз
    public void addCustomer(int index, Customer customer) {
        this.customers.add(index, customer);
    }

}
