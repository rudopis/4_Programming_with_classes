package com.anrudopis.aggregation_and_composition.task04.entity;

import com.anrudopis.aggregation_and_composition.task04.logic.BankAccountLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class Customer {

    private String login;
    private long password;
    private List<BankAccount> accounts;
    private double totalBalance;
    private double balance;
    private double debt;

    public Customer() {
        accounts = new ArrayList<>();
    }


    public Customer(String login, long password) {
        this.login = login;
        this.password = password;
        totalBalance = 0;
        balance = 0;
        debt = 0;
        accounts = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public BankAccount getAccountByIndex(int index) {
        return accounts.get(index);
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance() {
        BankAccountLogic logic = BankAccountLogic.getInstance();
        totalBalance = logic.calculateTotalBalance(getAccounts());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        BankAccountLogic logic = BankAccountLogic.getInstance();
        balance = logic.calculateBalance(getAccounts());
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt() {
        BankAccountLogic logic = BankAccountLogic.getInstance();
        debt = logic.calculateDebt(getAccounts());
    }

    //блокировка счёта
    public void lockAccount(BankAccount account) {
        account.setStatus("Locked");
    }

    //разблокировать счёт
    public void unlockAccount(BankAccount account) {
        account.setStatus("Unlocked");
    }

    //пополнить счёт
    public void makeDeposit(BankAccount account, double deposit) {
        double balance;
        balance = deposit + account.getBalance();
        account.setBalance(balance);
    }

    //снять деньги со счёта
    public void takeOutMoney(BankAccount account, double sum) {
        double balance;
        balance = account.getBalance() - sum;
        account.setBalance(balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getPassword() == customer.getPassword() &&
                Double.compare(customer.getTotalBalance(), getTotalBalance()) == 0 &&
                Double.compare(customer.getBalance(), getBalance()) == 0 &&
                Double.compare(customer.getDebt(), getDebt()) == 0 &&
                Objects.equals(getLogin(), customer.getLogin()) &&
                Objects.equals(getAccounts(), customer.getAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getAccounts(), getTotalBalance(), getBalance(), getDebt());
    }

    @Override
    public String toString() {
        return "Клиент с логином: " + getLogin() + '\'' +
                "Общий баланс счетов: " + getTotalBalance() +
                " Cумма положительных счетов: " + getBalance() +
                " Суммарная задолженнсть по счетам: " + getDebt();
    }
}
