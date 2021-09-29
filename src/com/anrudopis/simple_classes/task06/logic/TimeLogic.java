package com.anrudopis.simple_classes.task06.logic;

import com.anrudopis.simple_classes.task06.entity.Time;

public class TimeLogic {
    private static final TimeLogic instance = new TimeLogic();

    private TimeLogic() {

    }

    public static TimeLogic getInstance() {
        return instance;
    }

    //проверка допустимых значений часов, минут, секунд при создании объекта
    public static boolean validate(int hour, int minute, int second) {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            return false;
        }

        return true;
    }

    public void increaseHour(int hour, Time time) {
        hour = hour + time.getHour();

        if (hour <= 24) {
            time.setHour(hour);
        } else {
            System.out.println("Получается недопустимое значение, время не будет изменено");
        }
    }

    public void decreaseHour(int hour, Time time) {
        hour = time.getHour() - hour;

        if (hour >= 0) {
            time.setHour(hour);
        } else {
            System.out.println("Получается недопустимое значение, время не будет изменено");
        }
    }

    public void increaseMinute(int minute, Time time) {
        minute = minute + time.getMinute();

        if (minute <= 59) {
            time.setMinute(minute);
        } else {
            int hour;
            hour = minute / 60;
            minute = minute % 60;

            increaseHour(hour, time);
            time.setMinute(minute);
        }
    }

    public void decreaseMinute(int minute, Time time) {
        minute = time.getMinute() - minute;

        if (minute >= 0) {
            time.setMinute(minute);
        } else {
            if (time.getHour() != 0) {
                int hourInMinute;
                int hour;

                hourInMinute = time.getHour() * 60;
                hour = (hourInMinute + minute) / 60;
                minute = (hourInMinute + minute) % 60;

                time.setHour(hour);
                time.setMinute(minute);
            } else {
                System.out.println("Получается недопустимое значение, время не будет изменено");
            }
        }
    }

    public void increaseSecond(int second, Time time) {
        second = second + time.getSecond();

        if (second <= 59) {
            time.setSecond(second);
        } else {
            int minute;
            minute = second / 60;
            second = second % 60;

            increaseMinute(minute, time);
            time.setSecond(second);
        }
    }

    public void decreaseSecond(int second, Time time) {
        second = time.getSecond() - second;

        if (second >= 0) {
            time.setSecond(second);
        } else {
            if (time.getMinute() != 0) {
                int minuteInSecond;
                int minute;

                minuteInSecond = time.getMinute() * 60;
                minute = (minuteInSecond + second) / 60;
                second = (minuteInSecond + second) % 60;

                time.setMinute(minute);
                time.setSecond(second);
            } else if (time.getHour() != 0) {
                int hourInSecond;
                int hour;
                int minute;

                hourInSecond = time.getHour() * 3600;
                hour = (hourInSecond + second) / 3600;
                minute = ((hourInSecond + second) % 3600) / 60;
                second = ((hourInSecond + second) % 3600) % 60;

                time.setHour(hour);
                time.setMinute(minute);
                time.setSecond(second);

            } else {
                System.out.println("Получается недопустимое значение, время не будет изменено");
            }

        }
    }
}
