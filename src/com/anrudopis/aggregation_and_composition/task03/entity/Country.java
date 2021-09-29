package com.anrudopis.aggregation_and_composition.task03.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Country {
    private String name;
    private City capital;
    private List<Region> regions = new ArrayList<>();
    private double countrySquare;
    private int numberOfRegion;

    public Country() {

    }

    public Country(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    //возвращает область из списка всех областей страны по индексу в списке
    public Region getRegion(int index) {
        return regions.get(index);
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    //добавить область к списку областей страны
    public void addRegion(Region region) {
        regions.add(region);
    }

    public double getCountrySquare() {
        return countrySquare;
    }

    public void setCountrySquare(double countrySquare) {
        this.countrySquare = countrySquare;
    }

    public int getNumberOfRegion() {
        return numberOfRegion;
    }

    public void setNumberOfRegion() {
        numberOfRegion = getRegions().size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (null == o) {
            return false;
        }

        if (!(o instanceof Country)) {
            return false;
        }
        Country country = (Country) o;

        if (this.getNumberOfRegion() != country.getNumberOfRegion() || this.getCountrySquare() != country.getCountrySquare() ||
                !this.getName().equals(country.getName()) || !this.getCapital().equals(country.getCapital()) ||
                !this.getRegions().equals(country.getRegions())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return getName() + ": столица - " + getCapital() + ", площадь территории - " + getCountrySquare() +
                "km2, количество областей - " + getNumberOfRegion();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCapital(), getRegions(), getCountrySquare(), getNumberOfRegion());
    }
}
