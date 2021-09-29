package com.anrudopis.simple_classes.task07.entity;

import java.util.Objects;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point() {

    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getCoordinateY() {
        return coordinateY;
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

        Point point = (Point) obj;

        if (this.coordinateX != point.coordinateX || this.coordinateY != point.coordinateY) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (this.coordinateX * 10 + Objects.hash(this.coordinateY));
    }

    @Override
    public String toString() {
        return "@Point(" + this.coordinateX + ", " + this.coordinateY + ")";
    }
}
