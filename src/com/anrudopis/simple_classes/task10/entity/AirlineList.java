package com.anrudopis.simple_classes.task10.entity;

import java.util.ArrayList;
import java.util.List;

//Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.

public class AirlineList {
    private List<Airline> airlines = new ArrayList<>();

    public AirlineList() {

    }

    public AirlineList(List<Airline> airlines) {
        this.airlines = airlines;
    }

    //возвращает список рейсов
    public List<Airline> getAirlines() {
        return airlines;
    }

    //возвращает часть списка рейсов в указанном интервале
    public List<Airline> getAirlines(int fromIndex, int toIndex) {
        return airlines.subList(fromIndex, toIndex);
    }

    //возвращает конкретный рейс из списка по указанному порядковому индексу
    public Airline getAirlineByIndex(int index) {
        return airlines.get(index);
    }

    //добавляет список рейсов к уже существующему
    public void addAirlines(List<Airline> airlines) {
        this.airlines.addAll(airlines);
    }

    //добавляет новый рейс в конец списка
    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    //добавляет новый рейс на указанную позицию в списке
    public void addAirline(int index, Airline airline) {
        airlines.add(index, airline);
    }


}
