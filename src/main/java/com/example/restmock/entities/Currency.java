package com.example.restmock.entities;

public enum Currency {
    RUR("Рубль"),
    EUR("Евро"),
    USD("Доллар"),
    KZT("Тэнге");

    private String title;

    Currency(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
