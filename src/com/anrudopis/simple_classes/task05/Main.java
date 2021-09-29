package com.anrudopis.simple_classes.task05;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
 * заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать
 * код, демонстрирующий все возможности класса.
 */

import com.anrudopis.simple_classes.task05.entity.Counter;
import com.anrudopis.simple_classes.task05.logic.CounterLogic;
import com.anrudopis.simple_classes.task05.view.CounterView;

public class Main {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter(5, 20);
        CounterView view = CounterView.getInstance();
        CounterLogic logic = CounterLogic.getInstance();

        view.printCounter(count1);
        view.printCounter(count2);

        logic.decreaseCounter(count1);
        logic.increaseCounter(count2);

        view.printCounter(count1);
        view.printCounter(count2);
        view.printCurrentCount(count2);

    }

}
