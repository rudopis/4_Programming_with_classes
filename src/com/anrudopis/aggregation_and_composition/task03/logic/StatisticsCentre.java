package com.anrudopis.aggregation_and_composition.task03.logic;

import com.anrudopis.aggregation_and_composition.task03.entity.Country;
import com.anrudopis.aggregation_and_composition.task03.entity.Region;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class StatisticsCentre {
    private static  final  StatisticsCentre instance = new StatisticsCentre();

    private StatisticsCentre(){

    }

    public static StatisticsCentre getInstance(){
        return instance;
    }

    public double calculateCountrySquare(Country country){
        double square = 0;
        for (Region r : country.getRegions()){
            square = square + r.getRegionSquare();
        }
        return square;
    }
}
