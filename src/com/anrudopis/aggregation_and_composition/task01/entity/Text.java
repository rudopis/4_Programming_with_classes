package com.anrudopis.aggregation_and_composition.task01.entity;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class Text {
    private String title;
    private List<Sentence> lyrics = new ArrayList<>();

    public Text() {

    }

    public Text(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<Sentence> lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj) {
            return false;
        }

        if (!(obj instanceof Text)) {
            return false;
        }

        Text text = (Text) obj;

        if (!this.getTitle().equals(text.getTitle()) || !this.getLyrics().equals(text.getLyrics())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String allText = "";

        for (Sentence sentence : lyrics) {
            for (Word word : sentence.getPhrase()) {
                allText = allText + word + " ";
            }
            allText = allText + ". ";
        }

        return "Text - ''" + this.getTitle() + "'' : " + allText;
    }
}
