package com.anrudopis.aggregation_and_composition.task04.entity;

import java.util.Objects;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class BankAccount {
    private long id;
    private String bank;
    private double balance;
    private String status;

    public BankAccount() {

    }

    public BankAccount(long id, String bank, double balance) {
        this.id = id;
        this.bank = bank;
        this.balance = balance;
        status = "Unlocked";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (!(obj instanceof BankAccount)) {
            return false;
        }

        BankAccount account = (BankAccount) obj;

        if (this.getId() != account.getId() || this.getBalance() != account.getBalance() ||
                !this.getBank().equals(account.getBank()) || !this.getStatus().equals(account.getStatus())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBank(), getBalance(), getStatus());
    }

    @Override
    public String toString() {
        return "Account number " + getId() + " of " + getBank() + ": balance " + getBalance() + "; status " + getStatus();
    }
}
