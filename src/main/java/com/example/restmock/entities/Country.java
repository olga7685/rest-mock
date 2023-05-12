package com.example.restmock.entities;

public enum Country {

    RUSSIA("Россия"),
    GEORGIA("Грузия"),
    KAZAKHSTAN("Казахстан"),
    UKRAINE("Украина"),
    ARMENIA("Армения");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

