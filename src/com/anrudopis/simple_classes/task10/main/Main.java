package com.anrudopis.simple_classes.task10.main;

import com.anrudopis.simple_classes.task10.entity.Airline;
import com.anrudopis.simple_classes.task10.entity.AirlineList;
import com.anrudopis.simple_classes.task10.logic.AirlineLogic;
import com.anrudopis.simple_classes.task10.view.AirlineView;

import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {

        AirlineView view = AirlineView.getInstance();
        AirlineLogic logic = AirlineLogic.getInstance();
        AirlineList list = new AirlineList();

        list.addAirline(new Airline(220, "Paris", "Boeing", new String[]{"Monday", "Friday"}, 12, 20));
        list.addAirline(new Airline(330, "Warsaw", "TU-134", new String[]{"Monday", "Wednesday"}, 10, 30));
        list.addAirline(new Airline(225, "Paris", "Boeing", new String[]{"Tuesday", "Friday"}, 17, 15));
        list.addAirline(new Airline(110, "Madrid", "Boeing", new String[]{"Thursday", "Sunday"}, 13, 35));

        String userDestination;
        String userDay;
        int userHour;
        int userMinute;

        @SuppressWarnings("resource")
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите название пункта назначения - на английском, первая буква прописная");
        userDestination = scr.next();
        System.out.println("Airlines to " + userDestination + ":");
        view.printAirlineList(logic.findByDestination(userDestination, list.getAirlines()));

        System.out.println("Введите день недели - на английском, с большой буквы");
        userDay = scr.next();
        System.out.println("Airlines on " + userDay + ":");
        view.printAirlineList(logic.findByDay(userDay, list.getAirlines()));

        System.out.println("Введите часы отправления (0-24) и минуты (0-59), затем день недели - на английском, с большой буквы");
        userHour = scr.nextInt();
        userMinute = scr.nextInt();
        userDay = scr.next();
        System.out.println("Airlines on " + userDay + " after " + userHour + ":" + userMinute);
        view.printAirlineList(logic.findByDayAndTime(userDay, userHour, userMinute, list.getAirlines()));
    }
}
