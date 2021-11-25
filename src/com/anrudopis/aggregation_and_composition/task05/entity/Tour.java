package com.anrudopis.aggregation_and_composition.task05.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Tour {

    private Voucher voucher;
    private Transport transport;
    private Meal meal;
    private boolean isItBooked;
    private Calendar firstDay;
    private Calendar lastDay;

    {
        isItBooked = false;
    }

    public Tour() {

    }

    public Tour(Voucher voucher, Transport transport, Meal meal) {
        this.voucher = voucher;
        this.transport = transport;
        this.meal = meal;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public boolean getIsItBooked() {
        return isItBooked;
    }

    public void setItBooked(){
        isItBooked = true;
    }

    public Calendar getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Calendar firstDay) {
        this.firstDay = firstDay;
    }

    public void setFirstDay(int year, int month, int day) {
        firstDay = new GregorianCalendar(year, month, day);
    }

    public Calendar getLastDay() {
        return lastDay;
    }

    public void setLastDay(Calendar lastDay) {
        this.lastDay = lastDay;
    }

    public void setLastDay(int year, int month, int day) {
        lastDay = new GregorianCalendar(year, month, day);
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

        Tour tour = (Tour) obj;

        if (this.isItBooked != tour.isItBooked || !this.voucher.equals(tour.voucher) ||
                !this.transport.equals(tour.transport) || !this.meal.equals(tour.meal) ||
                !this.firstDay.equals(tour.firstDay) || !this.lastDay.equals(tour.lastDay)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVoucher(), getTransport(), getMeal(), isItBooked, getFirstDay(), getLastDay());
    }

    @Override
    public String toString() {
        return "Путёвка@категория '" + voucher.getTypeOfTour() + "', трансфер = " + transport.getTypeOfTransport() +
                ", тип питания = " + meal.getMealType() + ", забронирован = " + isItBooked + ", дата отъезда = " +
                firstDay.getTime() + ", дата возвращения = " + lastDay.getTime();
    }
}
