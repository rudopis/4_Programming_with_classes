package com.anrudopis.aggregation_and_composition.task04.view;

import com.anrudopis.aggregation_and_composition.task04.entity.BankAccount;
import com.anrudopis.aggregation_and_composition.task04.entity.Customer;
import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class View {

    private final static View instance = new View();

    private View(){

    }

    public static View getInstance(){
        return instance;
    }

    public void printCustomer(Customer customer){
        System.out.println(customer.toString());
    }

    public void printListAccounts (List<BankAccount> accounts){
        System.out.println("Счета: ");

        for (BankAccount acc : accounts){
            System.out.println(acc.toString());
        }
    }
}
