package com.anrudopis.simple_classes.task03.view;

import com.anrudopis.simple_classes.task03.entity.Student;

import java.util.List;

public class StudentView {
    public void print (Student student) {
        System.out.println(student.toString());
    }

    public void print (List<Student> students){
        for (Student st : students){
            System.out.println(st.toString());
        }
    }
}
