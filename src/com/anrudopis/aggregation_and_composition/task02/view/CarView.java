package com.anrudopis.aggregation_and_composition.task02.view;

import com.anrudopis.aggregation_and_composition.task02.entity.Car;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class CarView {
    private static final CarView instance = new CarView();

    private CarView() {

    }

    public static CarView getInstance() {
        return instance;
    }

    public void printCarMake(Car car) {
        System.out.println("Марка автомобиля: " + car.getCarMake());
    }
}
