package com.PuricellaFederico.my_app_calcio.EccezzioniControllate;

public class GicoatoreException extends RuntimeException {

    private String name;

    private String surname;

    public GicoatoreException(String message , String name , String surname) {
        super(message);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
