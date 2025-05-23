package com.puricellafederico.my_app_calcio.customException;

public class ExceptionGicoatore extends RuntimeException {

    private String name;

    private String surname;

    public ExceptionGicoatore(String message , String name , String surname) {
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
