package com.anrudopis.simple_classes.task05.logic;

import com.anrudopis.simple_classes.task05.entity.Counter;

public class CounterLogic {
    private static CounterLogic instance;

    private CounterLogic() {

    }

    public static CounterLogic getInstance() {
        if (instance == null) {
            instance = new CounterLogic();
        }
        return instance;
    }

    public void increaseCounter(Counter counter) {
        if (counter.getCurrentCount() < counter.getLastValue() && (counter.getCurrentCount() + Counter.getStep()) <= counter.getLastValue()) {
            int value = counter.getCurrentCount() + Counter.getStep();
            counter.setCurrentCount(value);
        } else {
            System.out.println("Выход за пределы диапазона, нельзя увеличить значение");
        }
    }

    public void decreaseCounter(Counter counter) {
        if (counter.getCurrentCount() > counter.getFirstValue() && (counter.getCurrentCount() - Counter.getStep()) >= counter.getFirstValue()) {
            int value = counter.getCurrentCount() - Counter.getStep();
            counter.setCurrentCount(value);;
        } else {
            System.out.println("Выход за пределы диапазона, нельзя уменьшить значение");
        }
    }
}
