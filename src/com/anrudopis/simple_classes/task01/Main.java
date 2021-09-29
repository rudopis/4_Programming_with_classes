package com.anrudopis.simple_classes.task01;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который
 * находит наибольшее значение из этих двух переменных.
 */

public class Main {

    public static void main(String[] args) {

        Test01 test = new Test01();
        Test01View view = new Test01View();
        Test01Logic log = new Test01Logic();

        test.setA(5);
        test.setB(7);

        view.outToConsole(test);

        log.calculateSum(test.getA(), test.getB());
        log.compare(test.getA(), test.getB());

    }
}
