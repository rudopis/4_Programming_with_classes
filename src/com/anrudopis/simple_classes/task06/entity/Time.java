package com.anrudopis.simple_classes.task06.entity;

import com.anrudopis.simple_classes.task06.logic.TimeLogic;

import java.util.Objects;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут
 * и секунд.
 */

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public Time(int hour, int minute, int second) {
      if (TimeLogic.validate(hour, minute, second)){
          this.hour = hour;
          this.minute = minute;
          this.second = second;
      } else {
          System.out.println("Недопустимый формат времени");
      }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("Введено недопустимое значение, оно будет изменено на 0");
            this.hour = 0;
        }

    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Введено недопустимое значение, оно будет изменено на 0");
            this.minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Введено недопустимое значение, оно будет изменено на 0");
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Time time = (Time) obj;

        if (this.getHour() != time.getHour() || this.getMinute() != time.getMinute()
                || this.getSecond() != time.getSecond()) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getHour(), this.getMinute(), this.getSecond());
    }

    @Override
    public String toString() {
        return "@Time@hours: " + this.getHour() +
                "@minutes: " + this.getMinute() +
                "@seconds: " + this.getSecond();
    }
}
