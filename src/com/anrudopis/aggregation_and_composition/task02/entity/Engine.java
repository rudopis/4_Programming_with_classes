package com.anrudopis.aggregation_and_composition.task02.entity;

import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class Engine {
    private int numberOfCylinder;
    private double power;
    private String fuel;

    public Engine() {

    }

    public Engine(int numberOfCylinder, double power, String fuel) {
        this.numberOfCylinder = numberOfCylinder;
        this.power = power;
        this.fuel = fuel;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (!(obj instanceof Engine)) {
            return false;
        }

        Engine engine = (Engine) obj;

        if (this.getNumberOfCylinder() != engine.getNumberOfCylinder() || this.getPower() != engine.getPower() ||
                !this.getFuel().equals(engine.getFuel())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Engine: " + this.getNumberOfCylinder() + " cylinders, power = " + this.getPower() +
                "kW, fuel - " + this.getFuel();
    }

    @Override
    public int hashCode() {
        return (int) (100 * this.getPower() + this.getNumberOfCylinder() + Objects.hash(this.getFuel()));
    }
}
