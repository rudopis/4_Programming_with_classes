package com.anrudopis.aggregation_and_composition.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Region {
    private String name;
    private City mainCity;
    private List<District> districts = new ArrayList<>();
    private double regionSquare;

    public Region(){

    }

    public Region(String name, City mainCity, double regionSquare){
        this.name = name;
        this.mainCity = mainCity;
        this.regionSquare = regionSquare;
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

    public List<District> getDistricts(){
        return districts;
    }

    public void setDistricts(List<District> districts){
        this.districts = districts;
    }

    public double getRegionSquare(){
        return regionSquare;
    }

    public void setRegionSquare(double regionSquare){
        this.regionSquare = regionSquare;
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

        Region region = (Region) obj;

        if (this.getRegionSquare() != region.getRegionSquare() || !this.getName().equals(region.getName()) ||
        !this.getMainCity().equals(region.getMainCity()) || !this.getDistricts().equals(region.getDistricts())){
            return false;
        }

        return true;
    }

    @Override
    public String toString(){
        return this.getName() + "область: областной центр - " + this.getMainCity().getName() + ", площадь территории - " +
        this.getRegionSquare() + " km2";
    }

    @Override
    public int hashCode(){
        return (int) this.getRegionSquare() + Objects.hash(this.getName(), this.getMainCity());
    }
}
