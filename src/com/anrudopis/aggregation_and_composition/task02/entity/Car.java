package com.anrudopis.aggregation_and_composition.task02.entity;

import java.util.Arrays;
import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String carMake;

    {
        wheels = new Wheel[4];
    }

    public Car() {
        this.engine = new Engine();


    }

    public Car(String carMake, Engine engine) {
        this.carMake = carMake;
        this.engine = engine;

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;

        if (!this.getEngine().equals(car.getEngine()) || !Arrays.equals(this.getWheels(), car.getWheels()) ||
                !this.getCarMake().equals(car.getCarMake())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Car " + this.getCarMake() + ": engine( " + this.getEngine().toString() + ").";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getCarMake(), this.getEngine(), this.getWheels());
    }

    public void move() {
        System.out.println("Машина едет");
    }

    public void stop() {
        System.out.println("Машина остановилась");
    }
}
