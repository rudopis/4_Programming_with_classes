package com.anrudopis.simple_classes.task06;

import com.anrudopis.simple_classes.task06.logic.TimeLogic;
import com.anrudopis.simple_classes.task06.entity.Time;
import com.anrudopis.simple_classes.task06.view.TimeView;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут
 * и секунд.
 */

public class Main {
    public static void main(String[] args) {
        Time time = new Time(17, 46, 54);
        TimeLogic logic = TimeLogic.getInstance();
        TimeView view = TimeView.getInstance();

        view.printTime(time);

        logic.decreaseSecond(120, time);

        view.printTime(time);

    }
}
