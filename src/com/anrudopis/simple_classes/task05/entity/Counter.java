package com.anrudopis.simple_classes.task05.entity;

import java.util.Objects;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
 * заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать
 * код, демонстрирующий все возможности класса.
 */

public class Counter {
    private static int step;
    private int firstValue;
    private int lastValue;
    private int currentCount;

    static {
        step = 1;
    }

    public Counter() {

    }

    public Counter(int firstValue, int lastValue) {
        this.firstValue = firstValue;
        this.lastValue = lastValue;
        this.currentCount = firstValue;
    }

    public static int getStep(){
        return step;
    }

    public static void setStep(int value){
        step = value;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setLastValue(int lastValue) {
        this.lastValue = lastValue;
    }

    public int getLastValue() {
        return lastValue;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount){
        this.currentCount = currentCount;
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
        Counter counter = (Counter) obj;
        if (this.getFirstValue() != counter.getFirstValue() || this.getLastValue() != counter.getLastValue()
                || this.getCurrentCount() != counter.getCurrentCount()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getFirstValue(), this.getLastValue(), this.getCurrentCount());
    }

    @Override
    public String toString() {
        return "@Counter@firstValue:" + this.getFirstValue()
                + "@lastValue:" + this.getLastValue()
                + "@currentCount:" + this.getCurrentCount()
                + "@step:" + Counter.step;
    }
}
