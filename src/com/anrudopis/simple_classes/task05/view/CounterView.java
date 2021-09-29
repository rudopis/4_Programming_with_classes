package com.anrudopis.simple_classes.task05.view;

import com.anrudopis.simple_classes.task05.entity.Counter;

public class CounterView {
    private static CounterView instance;

    private CounterView() {

    }

    public static CounterView getInstance() {
        if (instance == null) {
            instance = new CounterView();
        }
        return instance;
    }

    public void printCounter(Counter counter) {
        System.out.println(counter.toString());
    }

    public void printCurrentCount(Counter counter) {
        System.out.println("Текущее значение счётчика: " + counter.getCurrentCount());
    }

}
