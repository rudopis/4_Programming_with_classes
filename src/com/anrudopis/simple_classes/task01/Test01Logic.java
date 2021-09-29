package com.anrudopis.simple_classes.task01;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который
 * находит наибольшее значение из этих двух переменных.
 */

public class Test01Logic {

    public int calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("a + b = " + sum);
        return sum;
    }

    public int compare(int a, int b) {
        if (a == b) {
            System.out.println("Cравниваемые числа равны");
            return a;
        }

        if (a > b) {
            System.out.println("a > b, a = " + a);
            return a;
        } else {
            System.out.println("b > a, b = " + b);
            return b;
        }

    }
}
