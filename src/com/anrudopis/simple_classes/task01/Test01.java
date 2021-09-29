package com.anrudopis.simple_classes.task01;

import java.util.Objects;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который
 * находит наибольшее значение из этих двух переменных.
 */

public class Test01 {
    private int a;
    private int b;

    public Test01() {
    }

    public Test01(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
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
        Test01 test01 = (Test01) obj;
        if (this.getA() != test01.getA() || this.getB() != test01.getB()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getA(), this.getB());
    }

    @Override
    public String toString() {
        return "Test01@" + "a="
                + this.getA() + "b="
                + this.getB();
    }
}
