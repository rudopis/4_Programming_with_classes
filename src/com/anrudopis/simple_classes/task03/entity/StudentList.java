package com.anrudopis.simple_classes.task03.entity;

import java.util.List;

/*
 * Класс StudentList создает список из 10 студентов (согласно условию задачи).
 */

public class StudentList {

    final String[] name = {"Buza E.A.", "Urbanovich M.V", "Novik S.I", "Kapuza A.S.", "Zolotuhina O.A.",
            "Scherbo A.M.", "Bur M.M.", "Pavlovich I.A.", "Panteleev M.I.", "Sverdlova I.G."};

    // создаётся список студентов, имя студента из массива имён, номер группы генерируется рандомно
    public void generateStudentList(List<Student> students) {
        int groupNumber;

        for (int i = 0; i < name.length; i++) {
            groupNumber = (int) (Math.random() * 100);
            students.add(new Student(name[i], groupNumber));
        }
    }

    //генерируется список успеваемости каждого студента
    public void generateAchievement(List<Student> students) {
        int mark;

        for (Student st : students) {
            for (int i = 0; i < 5; i++) {
                mark = (int) (Math.random() * 10 + 1);
                st.setAchievement(i, mark);
            }
        }
    }
}
