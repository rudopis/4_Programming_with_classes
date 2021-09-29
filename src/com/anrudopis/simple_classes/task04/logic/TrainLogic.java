package com.anrudopis.simple_classes.task04.logic;

import com.anrudopis.simple_classes.task04.entity.Train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainLogic {

    public List<Train> sortByNumber(List<Train> trains) {
        List<Train> listSort = new ArrayList<>();
        listSort.addAll(trains);
        int i = 0;

        while (i < (listSort.size() - 1)) {
            int numberOfTrain1;
            int numberOfTrain2;
            numberOfTrain1 = listSort.get(i).getNumberOfTrain();
            numberOfTrain2 = listSort.get(i + 1).getNumberOfTrain();

            if (numberOfTrain1 > numberOfTrain2) {
                Train temp = listSort.get(i);
                listSort.set(i, listSort.get(i + 1));
                listSort.set(i + 1, temp);
                i = 0;
            } else {
                i++;
            }
        }
        return listSort;
    }

    public List<Train> sortByDestination(List<Train> trains) {
        List<Train> sortList = new ArrayList<>();
        Comparator<Train> trainComparator = new TrainDestinationComparator().thenComparing(new TrainTimeComparator());
        sortList.addAll(trains);
        sortList.sort(trainComparator);
        return sortList;
    }

}
