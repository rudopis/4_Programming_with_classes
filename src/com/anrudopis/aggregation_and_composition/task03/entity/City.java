package com.anrudopis.aggregation_and_composition.task03.entity;

import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class City {
    private String name;

    public City(){

    }

    public City(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

        City city = (City) obj;

        if (!this.getName().equals(city.getName())){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return "город " + this.getName();
    }

    @Override
    public int hashCode(){
        return 100 + Objects.hash(this.getName());
    }
}
