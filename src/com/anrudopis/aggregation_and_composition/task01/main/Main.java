package com.anrudopis.aggregation_and_composition.task01.main;

import com.anrudopis.aggregation_and_composition.task01.entity.Sentence;
import com.anrudopis.aggregation_and_composition.task01.entity.Text;
import com.anrudopis.aggregation_and_composition.task01.entity.Word;
import com.anrudopis.aggregation_and_composition.task01.logic.SentenceEditor;
import com.anrudopis.aggregation_and_composition.task01.logic.TextEditor;
import com.anrudopis.aggregation_and_composition.task01.view.TextView;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {

        Text text = new Text("Начало зимы");

        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();

        Word word1 = new Word("Cнег");
        Word word2 = new Word("идёт");
        Word word3 = new Word("Зима");
        Word word4 = new Word("пришла");

        SentenceEditor.getInstance().addWord(sentence1, word1);
        SentenceEditor.getInstance().addWord(sentence1, word2);
        SentenceEditor.getInstance().addWord(sentence2, word3);
        SentenceEditor.getInstance().addWord(sentence2, word4);

        TextEditor.getInstance().add(sentence1, text);
        TextEditor.getInstance().add(sentence2, text);

        System.out.println(sentence1.toString());

        TextView.print(text);

    }
}
