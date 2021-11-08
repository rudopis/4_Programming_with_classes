package com.anrudopis.aggregation_and_composition.task04.logic;

import com.anrudopis.aggregation_and_composition.task04.entity.BankAccount;

import java.util.Comparator;

public class BankAccountIdComparator implements Comparator<BankAccount> {

    public int compare(BankAccount a, BankAccount b) {
        if (a.getId() > b.getId()) {
            return 1;
        } else if (a.getId() < b.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
