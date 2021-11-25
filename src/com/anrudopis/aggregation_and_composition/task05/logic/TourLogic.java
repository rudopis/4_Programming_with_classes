package com.anrudopis.aggregation_and_composition.task05.logic;

import com.anrudopis.aggregation_and_composition.task05.entity.Meal;
import com.anrudopis.aggregation_and_composition.task05.entity.Tour;
import com.anrudopis.aggregation_and_composition.task05.entity.Transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TourLogic {
    private static final TourLogic instance = new TourLogic();

    private TourLogic(){

    }

    public static TourLogic getInstance(){
        return instance;
    }

    public void bookTour(Tour tour) {
        tour.setItBooked();
    }

    public List<Tour> chooseTourByDuration(List<Tour> tours, int numberOfDay) {
        List<Tour> sortList = new ArrayList<>();

        for (Tour tour : tours) {
            if ((int) Math.round(((tour.getLastDay().getTime().getTime() - tour.getFirstDay().getTime().getTime()) / 86400000)) == numberOfDay) {
                sortList.add(tour);
            }
        }
        return sortList;
    }

    public List<Tour> chooseTourByTransport(List<Tour> tours, Transport transport) {
        List<Tour> sortList = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getTransport().equals(transport)) {
                sortList.add(tour);
            }
        }

        return sortList;
    }

    public List<Tour> chooseTourByMeal(List<Tour> tours, Meal meal) {
        List<Tour> sortList = new ArrayList<>();

        for (Tour tour : tours) {
            if (tour.getMeal().equals(meal)) {
                sortList.add(tour);
            }
        }

        return sortList;
    }

    public List<Tour> filterTourList(List<Tour> tours, int numberOfDay, Transport transport, Meal meal) {
        List<Tour> sortList;

        sortList = chooseTourByDuration(tours, numberOfDay);
        sortList = chooseTourByTransport(sortList, transport);
        sortList = chooseTourByMeal(sortList, meal);

        return sortList;
    }

    public void sortTourListByDate(List<Tour> tours) {
        Comparator<Tour> comparator = new TourDateComparator();
        tours.sort(comparator);
    }
}
