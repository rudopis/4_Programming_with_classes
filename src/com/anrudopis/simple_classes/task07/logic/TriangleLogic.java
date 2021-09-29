package com.anrudopis.simple_classes.task07.logic;

import com.anrudopis.simple_classes.task07.entity.Point;
import com.anrudopis.simple_classes.task07.entity.Triangle;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class TriangleLogic {

    private static final TriangleLogic instance = new TriangleLogic();

    private TriangleLogic() {

    }

    public static TriangleLogic getInstance() {
        return instance;
    }

    //проверяет, возможно ли создать треугольник с таким значением углов (сумма любых двух углов треугольника < 180)
    // углы не могут равняться 0
    public static boolean validate(int angleA, int angleB, int angleC) {
        if (angleA + angleB >= 180 || angleA + angleC >= 180 || angleB + angleC >= 180) {
            return false;
        }

        if (angleA <= 0 || angleB <= 0 || angleC <= 0) {
            return false;
        }

        return true;
    }

    //находим длину стороны треугольника через координаты вершин
    // sideAB = sqrt((xa - xb)^2 + (ya - yb)^2)
    public double findLength(Point apexA, Point apexB) {
        double sideAB;
        sideAB = sqrt(pow(apexB.getCoordinateX() - apexA.getCoordinateX(), 2) + pow(apexB.getCoordinateY() - apexA.getCoordinateY(), 2));
        return sideAB;
    }

    //вычисляем периметр треугольника - cумма длин всех сторон
    public double findPerimeter(Triangle triangle) {
        double perimeter;
        double sideAB;
        double sideBC;
        double sideAC;

        sideAB = findLength(triangle.getApexA(), triangle.getApexB());
        sideBC = findLength(triangle.getApexB(), triangle.getApexC());
        sideAC = findLength(triangle.getApexA(), triangle.getApexC());

        perimeter = sideAB + sideBC + sideAC;

        return perimeter;
    }

    //вычисляем площадь треугольника по двум сторонам и синусу угла между ними
    //S = 1/2*AB*BC*sin(angleB);
    public double findSquare(Triangle triangle) {
        double square;
        double sideAB;
        double sideBC;

        sideAB = findLength(triangle.getApexA(), triangle.getApexB());
        sideBC = findLength(triangle.getApexB(), triangle.getApexC());
        square = (sideAB * sideBC * Math.sin(triangle.getAngleB())) / 2;

        return square;
    }

    //находим координаты середины стороны треугольника (пересечение медианы и стороны треугольника)
    // x = (xb + xc)/2; y = (yb + yc)/2;
    public Point findMidpoint(Point apexB, Point apexC) {
        Point midpointBC;
        double coordinateX;
        double coordinateY;

        coordinateX = (apexB.getCoordinateX() + apexC.getCoordinateX()) / 2;
        coordinateY = (apexB.getCoordinateY() + apexC.getCoordinateY()) / 2;
        midpointBC = new Point(coordinateX, coordinateY);

        return midpointBC;
    }

    //находим координаты точки пересечения медиан треугольника
    //формула координат точки, делящей отрезок AB в соотношении m:n: x = (n*xa + m*xb)/(m+n); y = (n*ya + m*yb)/(m+n);
    //медианы треугольника делятся точкой их пересечения в соотношении 2:1, считая от вершины
    public Point findCrosspoint(Triangle triangle) {
        Point midpoint;
        Point crossPoint;
        double coordinateX;
        double coordinateY;

        midpoint = findMidpoint(triangle.getApexB(), triangle.getApexC());
        coordinateX = (triangle.getApexA().getCoordinateX() + 2 * midpoint.getCoordinateX()) / 3;
        coordinateY = (triangle.getApexA().getCoordinateY() + 2 * midpoint.getCoordinateY()) / 3;
        crossPoint = new Point(coordinateX, coordinateY);

        return crossPoint;
    }
}
