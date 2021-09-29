package com.anrudopis.simple_classes.task10.view;

import com.anrudopis.simple_classes.task10.entity.Airline;

import java.util.List;

public class AirlineView {
    private static final AirlineView instance = new AirlineView();

    private AirlineView() {

    }

    public static AirlineView getInstance() {
        return instance;
    }

    //выводит список рейсов на консоль
    public void printAirlineList(List<Airline> airlines) {
        for (Airline a : airlines) {
            System.out.println(a.toString());
        }
    }

    //выводит информацию о рейсе на консоль
    public void printAirline(Airline airline) {
        System.out.println(airline.toString());
    }
}
