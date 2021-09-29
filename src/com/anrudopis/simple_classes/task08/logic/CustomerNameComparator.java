package com.anrudopis.simple_classes.task08.logic;

import com.anrudopis.simple_classes.task08.entity.Customer;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

    //упорядочивает клиентов по ФИО
    public int compare(Customer customer1, Customer customer2) {
        String name1;
        String name2;

        name1 = customer1.getSecondName() + customer1.getName() + customer1.getNameOfFather();
        name2 = customer2.getSecondName() + customer2.getName() + customer2.getNameOfFather();

        return name1.compareTo(name2);
    }
}
