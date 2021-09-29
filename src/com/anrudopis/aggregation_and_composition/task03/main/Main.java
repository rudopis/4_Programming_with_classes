package com.anrudopis.aggregation_and_composition.task03.main;

import com.anrudopis.aggregation_and_composition.task03.entity.City;
import com.anrudopis.aggregation_and_composition.task03.entity.Country;
import com.anrudopis.aggregation_and_composition.task03.entity.Region;
import com.anrudopis.aggregation_and_composition.task03.logic.StatisticsCentre;
import com.anrudopis.aggregation_and_composition.task03.view.CountryView;

/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {

        City capital = new City("Минск");
        City city1 = new City("Брест");
        City city2 = new City("Витебск");
        City city3 = new City("Гомель");
        City city4 = new City("Гродно");
        City city5 = new City("Могилев");

        Region regionBrest = new Region("Брестская", city1, 32800);
        Region regionVitebsk = new Region("Витебская", city2, 40000);
        Region regionGomel = new Region("Гомельская", city3, 40400);
        Region regionGrodno = new Region("Гродненская", city4, 25100);
        Region regionMinsk = new Region("Минская", capital, 39900);
        Region regionMogilev = new Region("Могилёвская", city5, 29100);

        Country country = new Country("Беларсуь", capital);

        country.addRegion(regionBrest);
        country.addRegion(regionVitebsk);
        country.addRegion(regionGomel);
        country.addRegion(regionGrodno);
        country.addRegion(regionMinsk);
        country.addRegion(regionMogilev);

        double square;
        square = StatisticsCentre.getInstance().calculateCountrySquare(country);
        country.setCountrySquare(square);
        country.setNumberOfRegion();

        CountryView.getInstance().printCapital(country);
        CountryView.getInstance().printRegion(country);
        CountryView.getInstance().printSquare(country);


    }
}
