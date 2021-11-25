package com.anrudopis.aggregation_and_composition.task05.logic;

import com.anrudopis.aggregation_and_composition.task05.entity.Tour;
import java.util.Comparator;

public class TourDateComparator implements Comparator<Tour> {
    public int compare(Tour a, Tour b) {
        if (a.getFirstDay().before(b.getFirstDay())) {
            return -1;
        } else if (a.getFirstDay().after(b.getFirstDay())) {
            return 1;
        } else {
            return 0;
        }
    }
}
