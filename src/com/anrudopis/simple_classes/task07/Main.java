package com.anrudopis.simple_classes.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

import com.anrudopis.simple_classes.task07.entity.Point;
import com.anrudopis.simple_classes.task07.entity.Triangle;
import com.anrudopis.simple_classes.task07.logic.TriangleLogic;
import com.anrudopis.simple_classes.task07.view.TriangleView;

public class Main {
    public static void main(String[] args) {

        Point apexA = new Point(4, 10);
        Point apexB = new Point(-2, 1);
        Point apexC = new Point(2, -3);
        int angleA = 70;
        int angleB = 30;
        int angleC = 80;

        TriangleLogic logic = TriangleLogic.getInstance();
        TriangleView view = TriangleView.getInstance();

        Triangle triangleABC = new Triangle(apexA, apexB, apexC, angleA, angleB, angleC);

        view.print(triangleABC);
        System.out.println("Периметр ABC = " + logic.findPerimeter(triangleABC));
        System.out.println("Площадь ABC = " + logic.findSquare(triangleABC));
        System.out.println("Точка пересечения медиан треугольника: " + logic.findCrosspoint(triangleABC).toString());
    }
}
