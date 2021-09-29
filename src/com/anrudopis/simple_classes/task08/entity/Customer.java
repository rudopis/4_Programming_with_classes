package com.anrudopis.simple_classes.task08.entity;

import java.util.Objects;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервал
 */

public class Customer {

    private String name;
    private String secondName;
    private String nameOfFather;
    private String address;
    private int id;
    private int creditCardNumber;
    private int bankAccount;

    public Customer() {

    }

    public Customer(String secondName, String name, String nameOfFather) {
        this.secondName = secondName;
        this.name = name;
        this.nameOfFather = nameOfFather;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNameOfFather() {
        return nameOfFather;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Customer customer = (Customer) obj;

        if (this.id != customer.id || this.bankAccount != customer.bankAccount ||
                this.creditCardNumber != customer.creditCardNumber || !this.name.equals(customer.name) ||
                !this.nameOfFather.equals(customer.nameOfFather) || !this.secondName.equals(customer.secondName) ||
                !this.address.equals(customer.address)) {

            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getCreditCardNumber(), this.getBankAccount());
    }

    @Override
    public String toString() {
        return "@Customer{" +
                "id=" + this.id +
                ", secondName= " + this.secondName +
                ", name= " + this.name +
                ", nameOfFather= " + this.nameOfFather +
                ", address= " + this.address +
                ", creditCardNumber= " + this.creditCardNumber +
                ", bankAccount= " + this.bankAccount +
                '}';
    }

}
