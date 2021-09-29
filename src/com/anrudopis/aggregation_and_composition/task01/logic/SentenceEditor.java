package com.anrudopis.aggregation_and_composition.task01.logic;

import com.anrudopis.aggregation_and_composition.task01.entity.Sentence;
import com.anrudopis.aggregation_and_composition.task01.entity.Word;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class SentenceEditor {
    private static final SentenceEditor instance = new SentenceEditor();

    private SentenceEditor() {

    }

    public static SentenceEditor getInstance() {
        return instance;
    }

    public void addWord(Sentence sentence, Word word) {
        sentence.getPhrase().add(word);
    }

}
