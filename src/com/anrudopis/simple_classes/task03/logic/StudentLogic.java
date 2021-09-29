package com.anrudopis.simple_classes.task03.logic;

import com.anrudopis.simple_classes.task03.entity.Student;

import java.util.List;

public class StudentLogic {

    // метод находит отличников из списка студентов и выводит на консоль их имя и номер группы
    public void findExcellentStudent(List<Student> studentList) {
        int count = 0;
        for (Student student : studentList) {
            if (isItExcellentStudent(student)) {
                System.out.println(student.toString());
                count++;
            }
        }
        if (count == 0){
            System.out.println("Среди студентов нет отличников");
        }
    }

    //метод проверяет, является ли студент отличником, возвращая true или false
    public boolean isItExcellentStudent(Student student) {
        boolean excellentStudent = true;

        for (int i = 0; i < 5; i++) {
            if (student.getAchievement(i) < 9 && student.getAchievement(i) != 0) {
                excellentStudent = false;
                i = 5;
            }
        }

        return excellentStudent;
    }

}
