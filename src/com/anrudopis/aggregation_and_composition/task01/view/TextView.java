package com.anrudopis.aggregation_and_composition.task01.view;

import com.anrudopis.aggregation_and_composition.task01.entity.Text;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class TextView {
    public static void print(Text text) {
        System.out.println("Вот ваш текст");
        System.out.println(text.toString());
    }
}
