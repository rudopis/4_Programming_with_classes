package com.anrudopis.aggregation_and_composition.task01.entity;

import java.util.Objects;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class Word {
    private String spelling;

    public Word() {

    }

    public Word(String spelling) {
        this.spelling = spelling;
    }

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
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

        Word word = (Word) obj;

        if (!this.getSpelling().equals(word.getSpelling())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.getSpelling();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getSpelling());
    }
}
