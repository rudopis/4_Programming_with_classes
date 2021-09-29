package com.anrudopis.simple_classes.task04.entity;

import java.util.Calendar;
import java.util.Objects;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
 * возможность сортировки элементов массива по номерам поездов. Добавьте возможность
 * вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
 * сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.
 */

public class Train {
    private int numberOfTrain;
    private Calendar timeOfDeparture;
    private String destination;

    public Train() {

    }

    public Train(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public Train(int numberOfTrain, Calendar timeOfDeparture, String destination) {
        this.numberOfTrain = numberOfTrain;
        this.timeOfDeparture = timeOfDeparture;
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return this.numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public Calendar getTimeOfDeparture() {
        return this.timeOfDeparture;
    }

    public void setTimeOfDeparture(Calendar timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

        Train train = (Train) obj;

        if (this.getNumberOfTrain() != train.getNumberOfTrain()
                || !this.getTimeOfDeparture().equals(train.getTimeOfDeparture())
                || !this.getDestination().equals(train.getDestination())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        final int code = 15;

        result = this.getNumberOfTrain() * code +
                Objects.hash(this.getDestination(), this.getTimeOfDeparture());

        return result;
    }

    @Override
    public String toString() {
        return "Train@number:" + this.getNumberOfTrain() + ";destination:"
                + this.getDestination() + ";timeOfDeparture:" + this.getTimeOfDeparture().getTime();
    }

}
