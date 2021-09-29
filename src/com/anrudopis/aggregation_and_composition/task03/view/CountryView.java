package com.anrudopis.aggregation_and_composition.task03.view;

import com.anrudopis.aggregation_and_composition.task03.entity.Country;
import com.anrudopis.aggregation_and_composition.task03.entity.Region;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class CountryView {
    private static final CountryView instance = new CountryView();

    private CountryView(){

    }

    public static CountryView getInstance(){
        return instance;
    }

    public void printCapital(Country country){
        System.out.println("Столица - " + country.getName());
    }

    public void printRegion(Country country){
        System.out.println("Количетсво областей: " + country.getNumberOfRegion());

        for (Region region : country.getRegions()){
            System.out.println(region.getName() + ": областной центр - " + region.getMainCity() + ", площадь области "
                    + region.getRegionSquare());
        }
    }

    public void printSquare(Country country){
        System.out.println("Площадь страны: " + country.getCountrySquare());
    }
}
