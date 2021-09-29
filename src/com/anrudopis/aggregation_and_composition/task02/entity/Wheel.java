package com.anrudopis.aggregation_and_composition.task02.entity;

import java.util.Objects;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class Wheel {

    private String tyreType;

    public Wheel() {

    }

    public Wheel(String tyreType) {
        this.tyreType = tyreType;
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreTypee(String tyreType) {
        this.tyreType = tyreType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (!(obj instanceof Wheel)) {
            return false;
        }

        Wheel wheel = (Wheel) obj;

        if (!this.getTyreType().equals(wheel.getTyreType())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wheel@tyre type: " + this.getTyreType();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getTyreType());
    }
}
