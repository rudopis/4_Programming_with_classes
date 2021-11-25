package com.anrudopis.aggregation_and_composition.task05.entity;

public enum Transport {
    BUS("автобус"),
    TRAIN("поезд"),
    AIRPLANE("самолёт"),
    SHIP("круизный лайнер");

    private String typeOfTransport;

    Transport(String typeOfTransport){
        this.typeOfTransport = typeOfTransport;
    }

    public String getTypeOfTransport(){
        return typeOfTransport;
    }

    @Override
    public String toString(){
        return "Транспорт - " + getTypeOfTransport();
    }
}
