package com.anrudopis.simple_classes.task02;

public class Main {
    public static void main(String[] args) {
        Test02 test = new Test02("test", 25);
        Test02View view = new Test02View();

        view.outToConsole(test);

    }
}
