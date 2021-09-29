package com.anrudopis.simple_classes.task08.logic;

import com.anrudopis.simple_classes.task08.entity.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {
    private final static CustomerLogic instance = new CustomerLogic();

    private CustomerLogic() {

    }

    public static CustomerLogic getInstance() {
        return instance;
    }

    //упорядочивает список клиентов по ФИО в алфавитном порядке
    public void sortByName(List<Customer> customers) {
        Comparator<Customer> customerComparator = new CustomerNameComparator();
        customers.sort(customerComparator);
    }

    //формирует списко из клиентов по указанному диапазону номеров кредитных карт
    public List<Customer> sortByCreditCardNumber(List<Customer> customers, int firstNumber, int lastNumber) {
        List<Customer> sortCustomers = new ArrayList<>();

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCreditCardNumber() >= firstNumber &&
                    customers.get(i).getCreditCardNumber() <= lastNumber) {
                sortCustomers.add(customers.get(i));
            }
        }

        return sortCustomers;
    }
}
