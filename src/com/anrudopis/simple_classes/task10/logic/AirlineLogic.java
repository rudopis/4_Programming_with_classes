package com.anrudopis.simple_classes.task10.logic;

import com.anrudopis.simple_classes.task10.entity.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/*
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class AirlineLogic {
    private static final AirlineLogic instance = new AirlineLogic();

    private AirlineLogic() {

    }

    public static AirlineLogic getInstance() {
        return instance;
    }

    //метод находит и возвращает список рейсов для заданного пункта назначения
    public List<Airline> findByDestination(String destination, List<Airline> airlines) {
        List<Airline> airlinesByDestination = new ArrayList<>();

        for (Airline a : airlines) {
            if (a.getDestination().equals(destination)) {
                airlinesByDestination.add(a);
            }
        }

        return airlinesByDestination;
    }

    //метод находит и возвращает список рейсов для заданного дня недели
    public List<Airline> findByDay(String day, List<Airline> airlines) {
        List<Airline> airlinesByDay = new ArrayList<>();
        String[] dayArray;

        for (Airline a : airlines) {
            dayArray = a.getDay();

            for (int i = 0; i < dayArray.length; i++) {

                if (dayArray[i].equals(day)) {
                    airlinesByDay.add(a);
                    i = dayArray.length;
                }
            }
        }

        return airlinesByDay;
    }

    //метод находит и возвращает список рейсов для заданного дня недели, время вылета которых больше заданного
    public List<Airline> findByDayAndTime(String day, int hour, int minute, List<Airline> airlines) {
        LocalTime time = LocalTime.of(hour, minute);
        List<Airline> airlinesByDay = new ArrayList<>();
        List<Airline> airlinesByDayAndTime = new ArrayList<>();

        airlinesByDay = findByDay(day, airlines);

        for (Airline a : airlinesByDay) {
            if (a.getFlightTime().isAfter(time)) {
                airlinesByDayAndTime.add(a);
            }
        }

        return airlinesByDayAndTime;
    }
}
