package com.anrudopis.simple_classes.task06.view;

import com.anrudopis.simple_classes.task06.entity.Time;

public class TimeView {
    private static final TimeView instance = new TimeView();

    private TimeView() {

    }

    public static TimeView getInstance() {
        return instance;
    }

    public void printTime(Time time) {
        System.out.println(time.toString());
    }
}
