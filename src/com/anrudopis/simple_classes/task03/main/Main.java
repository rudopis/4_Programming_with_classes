package com.anrudopis.simple_classes.task03.main;

import com.anrudopis.simple_classes.task03.entity.Student;
import com.anrudopis.simple_classes.task03.entity.StudentList;
import com.anrudopis.simple_classes.task03.logic.StudentLogic;

import java.util.ArrayList;
import java.util.List;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        StudentList list = new StudentList();
        StudentLogic logic = new StudentLogic();

        list.generateStudentList(students);
        list.generateAchievement(students);
        logic.findExcellentStudent(students);

    }
}
