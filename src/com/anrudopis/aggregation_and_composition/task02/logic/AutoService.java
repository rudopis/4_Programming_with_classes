package com.anrudopis.aggregation_and_composition.task02.logic;

import com.anrudopis.aggregation_and_composition.task02.entity.Car;
import com.anrudopis.aggregation_and_composition.task02.entity.Wheel;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class AutoService {

    public AutoService() {

    }

    public void fillUpCar(Car car) {
        String fuel = car.getEngine().getFuel();
        System.out.println("Заправили 20 л - " + fuel);
    }

    public void changeTire(Car car, int numberOfWheel) {
        if (numberOfWheel <= car.getWheels().length) {
            int i = numberOfWheel;
            while (i != 0) {
                car.getWheels()[i] = new Wheel();
                i--;
            }
            System.out.println("Заменили " + numberOfWheel + " колеса/-о");
        } else {
            System.out.println("Введите корректное число колёс на замену");
        }
    }
}
