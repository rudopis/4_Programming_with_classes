package com.anrudopis.aggregation_and_composition.task04.main;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

import com.anrudopis.aggregation_and_composition.task04.entity.BankAccount;
import com.anrudopis.aggregation_and_composition.task04.entity.Customer;
import com.anrudopis.aggregation_and_composition.task04.logic.BankAccountLogic;
import com.anrudopis.aggregation_and_composition.task04.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(100, "Белгазпромбанк", 5800);
        BankAccount account2 = new BankAccount(12789, "Альфабанк", -1250);
        BankAccount account3 = new BankAccount(357, "Белгазпромбанк", 3000);
        BankAccount account4 = new BankAccount(8745, "MTБанк", -2300);

        List<BankAccount> accounts = new ArrayList<>();

        String login;
        long password;
        Customer customer;

        View view = View.getInstance();
        BankAccountLogic logic = BankAccountLogic.getInstance();

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        Scanner scr = new Scanner(System.in);


        System.out.println("Введите свой логин.");
        login = scr.nextLine();

        System.out.println("Введите свой пароль. Только цифровые символы.");
        if (scr.hasNextLong()) {
            password = scr.nextLong();
        } else {
            System.out.println("Ввели недопустимое значение пароля. Пароль будет сгенерирован автоматически");
            password = (long) (Math.random() * 10000);
        }

        scr.close();

        customer = new Customer(login, password);
        customer.setAccounts(accounts);
        customer.getAccountByIndex(1).setStatus("Locked");

        view.printListAccounts(customer.getAccounts());

        customer.setTotalBalance();
        customer.setBalance();
        customer.setDebt();

        view.printCustomer(customer);

        logic.findAccountById(customer.getAccounts(), 100);
        logic.sortBankAccount(customer);

        view.printListAccounts(customer.getAccounts());
    }
}
