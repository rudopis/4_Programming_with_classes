package com.anrudopis.aggregation_and_composition.task03.entity;

import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class District {
    private String name;
    private City mainCity;

    public District(){
    }

    public District(String name, City mainCity){
        this.name = name;
        this.mainCity = mainCity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public City getMainCity(){
        return mainCity;
    }

    public void setMainCity(City mainCity){
        this.mainCity = mainCity;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (null == obj){
            return false;
        }

        if(!(obj instanceof  District)){
            return false;
        }

        District d = (District) obj;

        if (!this.getName().equals(d.getName()) || !this.getMainCity().equals(d.mainCity)){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return "Район " + this.getName() + ": районный центр - " + this.getMainCity().getName();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getMainCity());
    }

}
