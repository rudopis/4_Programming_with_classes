package com.anrudopis.simple_classes.task03.entity;

import java.util.Arrays;
import java.util.Objects;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private String name;
    private int groupNumber;
    private int[] achievement;

    final int numberOfMarks = 5; //согласно условию успеваемость студента - массив из пяти элементов

    {
        this.achievement = new int[numberOfMarks];
    }

    public Student() {

    }

    public Student(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getAchievement(int index) {
        return achievement[index];
    }

    public void setAchievement(int index, int element) {
        this.achievement[index] = element;
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

        Student student = (Student) obj;
        if (this.groupNumber != student.groupNumber ||
                !Arrays.equals(this.achievement, student.achievement) ||
                !this.name.equals(student.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (12 * this.groupNumber + Objects.hash(this.name, this.achievement));
    }

    @Override
    public String toString() {
        return "Student@" + this.name +
                "groupNumber:" + this.groupNumber;

    }


}
