package com.puricellafederico.my_app_calcio.customException;

public class ExceptionTorneo extends RuntimeException {

    private String nomeTorneo;

    public ExceptionTorneo(String s , String nomeTorneo) {
        super(s);
        this.nomeTorneo = nomeTorneo;
    }

    public String getNomeTorneo() {
        return nomeTorneo;
    }
}
