package com.anrudopis.aggregation_and_composition.task02.main;

import com.anrudopis.aggregation_and_composition.task02.entity.Car;
import com.anrudopis.aggregation_and_composition.task02.entity.Engine;
import com.anrudopis.aggregation_and_composition.task02.logic.AutoService;
import com.anrudopis.aggregation_and_composition.task02.view.CarView;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(4, 73.5, "дизель");
        Car car = new Car("Toyota", engine);
        AutoService service = new AutoService();

        CarView.getInstance().printCarMake(car);

        car.move();
        car.stop();

        service.changeTire(car, 3);
        service.fillUpCar(car);

        car.move();


    }
}
