package com.anrudopis.aggregation_and_composition.task05.view;

import com.anrudopis.aggregation_and_composition.task05.entity.Tour;

import java.util.List;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TourView {
    private static final TourView instance = new TourView();

    private TourView() {

    }

    public static TourView getInstance() {
        return instance;
    }

    public void printTour(Tour tour) {
        System.out.println(tour.toString());
    }

    public void printTourList(List<Tour> tours) {
        for (Tour tour : tours) {
            printTour(tour);
        }
    }
}
