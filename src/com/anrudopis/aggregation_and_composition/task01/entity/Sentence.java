package com.anrudopis.aggregation_and_composition.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class Sentence {
    private List<Word> phrase = new ArrayList<>();

    public Sentence() {
    }

    public List<Word> getPhrase() {
        return phrase;
    }

    public void setPhrase(List<Word> phrase) {
        this.phrase = phrase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (!(obj instanceof Sentence)) {
            return false;
        }

        Sentence sentence = (Sentence) obj;

        if (!this.getPhrase().equals(sentence.getPhrase())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getPhrase());
    }

    @Override
    public String toString() {
        String s = "";

        for (Word word : this.getPhrase()) {
            s = s + word.getSpelling() + " ";
        }

        return s;
    }
}
