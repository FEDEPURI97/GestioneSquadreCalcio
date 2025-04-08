package com.PuricellaFederico.my_app_calcio.eccezzionicontrollate;

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
