package com.anrudopis.simple_classes.task10.entity;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

    private int flightNumber;
    private String destination;
    private String airplaneType;
    private String[] day;
    private LocalTime flightTime;

    public Airline() {

    }

    public Airline(int flightNumber, String destination, String airplaneType, String[] day, int hour, int minute) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airplaneType = airplaneType;
        this.day = day;
        this.flightTime = LocalTime.of(hour, minute);
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String[] getDay() {
        return day;
    }

    public void setDay(String[] day) {
        this.day = day;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int hour, int minute) {
        this.flightTime = LocalTime.of(hour, minute);
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

        Airline line = (Airline) obj;

        if (this.getFlightNumber() != line.getFlightNumber() || !this.getDestination().equals(line.getDestination()) ||
                !this.getAirplaneType().equals(line.getAirplaneType()) || !this.getDay().equals(line.getDay()) ||
                !this.getFlightTime().equals(line.getFlightTime())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.getFlightNumber() + Objects.hash(this.getDestination(), this.getAirplaneType(), this.getFlightTime());
    }


    @Override
    public String toString() {
        return "Airline: номер рейса " + this.getFlightNumber() + "; место прибытия " + this.getDestination() +
                "; тип самолёта " + this.getAirplaneType() + "; время вылета " + this.getFlightTime() +
                "; дни курсирования рейса: " + Arrays.toString(this.getDay());

    }
}
