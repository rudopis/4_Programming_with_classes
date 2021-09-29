package com.anrudopis.simple_classes.task04.main;

import com.anrudopis.simple_classes.task04.entity.Depot;
import com.anrudopis.simple_classes.task04.entity.Train;
import com.anrudopis.simple_classes.task04.logic.TrainLogic;
import com.anrudopis.simple_classes.task04.view.TrainView;

import java.util.*;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по номерам поездов. Добавьте возможность
 * вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
 * сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.
 */

public class Main {
    public static void main(String[] args) {
        Depot depot = new Depot(5);
        Depot depotSortByNumber = new Depot();
        Depot depotSortByDestination = new Depot();
        String[] cityArray = {"Minsk", "Kiev", "Paris", "Minsk", "Prague"};
        TrainView view = new TrainView();
        TrainLogic logic = new TrainLogic();
        List<Train> trainsSortByNumber;
        List<Train> trainsSortByDestination;

        // инициализируем поля каждого объекта Train из списка
        for (int i = 0; i < depot.getTrains().size(); i++) {
            int number;
            String destination;
            Calendar date;
            int rand;
            Train train;

            rand = (int) (Math.random() * 10 + 20);
            number = rand + i;
            destination = cityArray[i];
            date = new GregorianCalendar(2021, 03, rand, 12, 15 + i);
            train = depot.getTrains().get(i);

            train.setNumberOfTrain(number);
            train.setDestination(destination);
            train.setTimeOfDeparture(date);
        }


        view.print(depot); // выведем на консоль получившийся список поездов
        trainsSortByNumber = logic.sortByNumber(depot.getTrains());
        depotSortByNumber.getTrains().addAll(trainsSortByNumber);
        System.out.println("Поезда после сортировки по номеру: ");
        view.print(depotSortByNumber);

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите номер поезда");
        int number = scr.nextInt();
        System.out.println("Информация о поезде номер " + number);
        view.print(number, depot);

        trainsSortByDestination = logic.sortByDestination(depot.getTrains());
        depotSortByDestination.getTrains().addAll(trainsSortByDestination);
        System.out.println("Поезда после сортировки по месту прибытия и времени отправления: ");
        view.print(depotSortByDestination);

    }
}
