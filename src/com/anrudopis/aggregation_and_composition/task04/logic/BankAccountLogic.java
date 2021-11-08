package com.anrudopis.aggregation_and_composition.task04.logic;

import com.anrudopis.aggregation_and_composition.task04.entity.BankAccount;
import com.anrudopis.aggregation_and_composition.task04.entity.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class BankAccountLogic {

    private final static BankAccountLogic instance = new BankAccountLogic();

    private BankAccountLogic() {

    }

    public static BankAccountLogic getInstance() {
        return instance;
    }

    //поиск счёта по номеру
    public void findAccountById(List<BankAccount> accounts, long id) {
        int count = 0;

        for (BankAccount acc : accounts) {
            if (acc.getId() == id) {
                System.out.println("Искомый счёт: " + acc.toString());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Счета с таким номер не найдено. Проверьте вводимые данные");
        }
    }

    //сортировка счетов по сумме баланса, если суммы одинаковы, то по номеру счёта
    public void sortBankAccount(Customer customer) {

        Comparator<BankAccount> accountComparator = new BankAccountBalanceComparator().thenComparing(new BankAccountIdComparator());
        customer.getAccounts().sort(accountComparator);

    }

    //вычисляет общую сумму по всем счетам
    public double calculateTotalBalance(List<BankAccount> accounts) {
        double totalBalance = 0;

        for (BankAccount acc : accounts) {
            totalBalance = totalBalance + acc.getBalance();
        }

        return totalBalance;
    }

    //вычисляет общую сумму на счетах только с положительным балансом
    public double calculateBalance(List<BankAccount> accounts) {
        double balance = 0;

        for (BankAccount acc : accounts) {
            if (acc.getBalance() > 0) {
                balance = balance + acc.getBalance();
            }
        }

        return balance;
    }

    //вычисляет общую задолженность по счетам с отрицательным балансом
    public double calculateDebt(List<BankAccount> accounts) {
        double debt = 0;

        for (BankAccount acc : accounts) {
            if (acc.getBalance() < 0) {
                debt = debt + acc.getBalance();
            }
        }

        return debt;
    }
}
