package com.anrudopis.aggregation_and_composition.task05.main;

import com.anrudopis.aggregation_and_composition.task05.entity.Meal;
import com.anrudopis.aggregation_and_composition.task05.entity.Tour;
import com.anrudopis.aggregation_and_composition.task05.entity.Transport;
import com.anrudopis.aggregation_and_composition.task05.entity.Voucher;
import com.anrudopis.aggregation_and_composition.task05.logic.TourLogic;
import com.anrudopis.aggregation_and_composition.task05.view.TourView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 *  (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
 *  питания и числа дней. Реализовать выбор и сортировку путевок
 */

public class Main {
    public static void main(String[] args) {

        Tour tour1 = new Tour(Voucher.HOLIDAY, Transport.AIRPLANE, Meal.UAI);
        tour1.setFirstDay(2021, 11, 10);
        tour1.setLastDay(2021, 11, 20);

        Tour tour2 = new Tour(Voucher.HOLIDAY, Transport.AIRPLANE, Meal.UAI);
        tour2.setFirstDay(2021, 11, 1);
        tour2.setLastDay(2021, 11, 11);

        Tour tour3 = new Tour(Voucher.CRUISE, Transport.SHIP, Meal.AI);
        tour3.setFirstDay(2021, 11, 21);
        tour3.setLastDay(2021, 11, 31);

        Tour tour4 = new Tour(Voucher.EXCURSION, Transport.BUS, Meal.BB);
        tour4.setFirstDay(2022, 0, 8);
        tour4.setLastDay(2022, 0, 15);

        Tour tour5 = new Tour(Voucher.SHOPPING, Transport.BUS, Meal.RO);
        tour5.setFirstDay(2022, 1, 3);
        tour5.setLastDay(2022, 1, 5);

        List<Tour> tours = new ArrayList<>();
        List<Tour> sortList = new ArrayList<>();
        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        tours.add(tour4);
        tours.add(tour5);

        int numberOfDay;
        Transport transport = Transport.SHIP;
        Meal meal = Meal.AI;

        TourLogic logic = TourLogic.getInstance();
        TourView view = TourView.getInstance();

        System.out.println("Cписок всех доступных путёвок:");
        view.printTourList(tours);

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите количество дней отдыха: 2, 7 или 10");
        numberOfDay = scr.nextInt();

        System.out.println("Выберите тип транспорта: " + '\n' + "1 - автобус" + '\n' + "2 - самолёт" + '\n' + "3 - корабль");

        int t = scr.nextInt();

        switch (t) {
            case (1):
                transport = Transport.BUS;
                break;
            case (2):
                transport = Transport.AIRPLANE;
                break;
            case (3):
                transport = Transport.SHIP;
                break;
        }

        System.out.println("Выберите тип питания: " + '\n' + "1 - ультра всё включено" + '\n' + "2 - всё включено" + '\n' +
                "3 - только завтраки" + '\n' + "4 - без питания");

        int m = scr.nextInt();
        scr.close();

        switch (m) {

            case (1):
                meal = Meal.UAI;
                break;
            case (2):
                meal = Meal.AI;
                break;
            case (3):
                meal = Meal.BB;
                break;
            case (4):
                meal = Meal.RO;
                break;

        }

        sortList = logic.filterTourList(tours, numberOfDay, transport, meal);
        logic.sortTourListByDate(sortList);
        view.printTourList(sortList);

    }
}
