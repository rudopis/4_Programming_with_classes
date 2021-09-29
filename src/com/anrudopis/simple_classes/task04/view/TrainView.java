package com.anrudopis.simple_classes.task04.view;

import com.anrudopis.simple_classes.task04.entity.Depot;
import com.anrudopis.simple_classes.task04.entity.Train;

public class TrainView {

    public void print(Train train) {
        System.out.println(train.toString());
    }

    public void print(Depot depot) {
        System.out.println(depot.toString());
    }

    public void print(int numberOfTrain, Depot depot) {
        for (Train train : depot.getTrains()) {
            if (train.getNumberOfTrain() == numberOfTrain) {
                System.out.println(train.toString());
            }
        }
    }
}

