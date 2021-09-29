package com.anrudopis.simple_classes.task07.view;

import com.anrudopis.simple_classes.task07.entity.Triangle;

public class TriangleView {

    private static final TriangleView instance = new TriangleView();

    private TriangleView(){

    }

    public static TriangleView getInstance(){
        return instance;
    }

    public void print(Triangle triangle){
        System.out.println(triangle.toString());
        System.out.println(triangle.getApexA().toString());
        System.out.println(triangle.getApexB().toString());
        System.out.println(triangle.getApexC().toString());
    }
}
