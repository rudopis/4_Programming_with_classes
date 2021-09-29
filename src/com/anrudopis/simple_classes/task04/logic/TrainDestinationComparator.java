package com.anrudopis.simple_classes.task04.logic;

import com.anrudopis.simple_classes.task04.entity.Train;

import java.util.Comparator;

public class TrainDestinationComparator implements Comparator<Train> {
    public int compare(Train train1, Train train2) {
        return train1.getDestination().compareTo(train2.getDestination());
    }
}
