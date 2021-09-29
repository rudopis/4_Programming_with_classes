package com.anrudopis.simple_classes.task04.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depot {

    private List<Train> trains;

    {
        trains = new ArrayList<>();
    }

    public Depot() {

    }

    public Depot(int number) {
        for (int i = 0; i < number; i++) {
            trains.add(new Train());
        }
    }

    public List<Train> getTrains() {
        return this.trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
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
        Depot depot = (Depot) obj;
        if (!this.getTrains().equals(depot)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        final int index = 10;
        result = index + Objects.hash(this.getTrains());
        return result;
    }

    @Override
    public String toString() {
        String str = "";
        for (Train train : this.getTrains()) {
            str = str + train.toString() + "\n";
        }
        return str;
    }
}
