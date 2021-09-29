package com.anrudopis.simple_classes.task08.view;

import com.anrudopis.simple_classes.task08.entity.Customer;

import java.util.List;

public class CustomerView {

    private final static CustomerView instance = new CustomerView();

    private CustomerView() {

    }

    public static CustomerView getInstance() {
        return instance;
    }

    //выводит на консоль информацию о клиенте
    public void print(Customer customer) {
        System.out.println(customer.toString());
    }

    //выводит на консоль весь список клиентов
    public void print(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).toString());
        }
    }
}
