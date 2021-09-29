package com.anrudopis.aggregation_and_composition.task01.logic;

import com.anrudopis.aggregation_and_composition.task01.entity.Sentence;
import com.anrudopis.aggregation_and_composition.task01.entity.Text;
import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class TextEditor {
    private static final TextEditor instance = new TextEditor();

    private TextEditor() {
    }

    public static TextEditor getInstance() {
        return instance;
    }

    public void add(Sentence sentence, Text text) {
        text.getLyrics().add(sentence);
    }

    public void add(List<Sentence> sentences, Text text) {
        text.getLyrics().addAll(sentences);
    }
}
