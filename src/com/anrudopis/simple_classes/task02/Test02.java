package com.anrudopis.simple_classes.task02;

/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы
 * для полей экземпляра класса.
 */

import java.util.Objects;

public class Test02 {
    private String name;
    private int number;

    public Test02(){

    }

    public Test02(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (null == obj){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Test02 test02 = (Test02) obj;

        if (this.getNumber() != test02.getNumber()) {
            return false;
        }

        if (!this.getName().equals(test02.getName())){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        int hash;
        hash = (int) (10 * this.getNumber() + Objects.hash(this.getName()));
        return hash;
    }

    @Override
    public String toString(){
        return "Test02" + "@name="
                + this.getName() + ";number="
                + this.getNumber();
    }
}
