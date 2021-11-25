package com.anrudopis.aggregation_and_composition.task05.entity;

public enum Voucher {
    HOLIDAY("отдых"),
    EXCURSION("экскурсия"),
    SHOPPING("шоппинг"),
    CRUISE("морской круиз"),
    MEDICALTOURISM("медицинский туризм");

    private String typeOfTour;

    Voucher(String typeOfTour){
        this.typeOfTour = typeOfTour;
    }

    public String getTypeOfTour(){
        return typeOfTour;
    }

    @Override
    public String toString(){
        return "Voucher = " + getTypeOfTour();
    }
}
