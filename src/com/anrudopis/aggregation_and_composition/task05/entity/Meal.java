package com.anrudopis.aggregation_and_composition.task05.entity;

public enum Meal {
    UAI("ультра всё включено"),
    AI("всё включено"),
    BB("только завтраки"),
    RO("без питания");

    private String mealType;

    Meal(String mealType){
        this.mealType = mealType;
    }

    public String getMealType(){
        return mealType;
    }

    @Override
    public String toString(){
        return "Тип питания: " + mealType;
    }
}
