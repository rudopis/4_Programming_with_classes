package com.anrudopis.simple_classes.task04.logic;

import com.anrudopis.simple_classes.task04.entity.Train;

import java.util.Comparator;

public class TrainTimeComparator implements Comparator<Train> {
    public int compare(Train a, Train b) {
        if (a.getTimeOfDeparture().after(b.getTimeOfDeparture())) {
            return 1;
        } else if (a.getTimeOfDeparture().before(b.getTimeOfDeparture())) {
            return -1;
        } else {
            return 0;
        }
    }
}
