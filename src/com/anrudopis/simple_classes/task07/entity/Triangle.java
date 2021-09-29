package com.anrudopis.simple_classes.task07.entity;

import com.anrudopis.simple_classes.task07.logic.TriangleLogic;

import java.util.Objects;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Triangle {

    //вершины треугольника
    private Point apexA;
    private Point apexB;
    private Point apexC;

    //углы треугольника
    private int angleA;
    private int angleB;
    private int angleC;

    public Triangle() {

    }

    public Triangle(Point apexA, Point apexB, Point apexC, int angleA, int angleB, int angleC) {
        if (TriangleLogic.validate(angleA, angleB, angleC)) {
            this.apexA = apexA;
            this.apexB = apexB;
            this.apexC = apexC;
            this.angleA = angleA;
            this.angleB = angleB;
            this.angleC = angleC;
        } else {
            System.out.println("Треугольник с такими углами создать нельзя, проверьте вводимое значение");
        }
    }

    public void setApexA(Point apexA) {
        this.apexA = apexA;
    }

    public Point getApexA() {
        return apexA;
    }

    public void setApexB(Point apexB) {
        this.apexB = apexB;
    }

    public Point getApexB() {
        return apexB;
    }

    public void setApexC(Point apexC) {
        this.apexC = apexC;
    }

    public Point getApexC() {
        return apexC;
    }

    public void setAngleA(int angleA) {
        if (angleA > 0) {
            this.angleA = angleA;
        } else {
            System.out.println("Недопустимое значение величины угла теугольника!");
        }
    }

    public int getAngleA() {
        return angleA;
    }

    public void setAngleB(int angleB) {
        if (angleB > 0) {
            this.angleB = angleB;
        } else {
            System.out.println("Недопустимое значение величины угла теугольника!");
        }
    }

    public int getAngleB() {
        return angleB;
    }

    public void setAngleC(int angleC) {
        if (angleC > 0) {
            this.angleC = angleC;
        } else {
            System.out.println("Недопустимое значение величины угла теугольника!");
        }
    }

    public int getAngleC() {
        return angleC;
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

        Triangle triangle = (Triangle) obj;

        if (this.angleA != triangle.angleA || this.angleB != triangle.angleB || this.angleC != triangle.angleC ||
                !this.apexA.equals(triangle.apexA) || !this.apexB.equals(triangle.apexB) ||
                !this.apexC.equals(triangle.apexC)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (this.angleA + this.angleB + this.angleC + Objects.hash(this.apexA, this.apexB, this.apexC));
    }

    @Override
    public String toString() {
        return "@Triangle @angleA: " + this.angleA + " @angleB: " + this.angleB + " @angleC: " + this.angleC;
    }
}
