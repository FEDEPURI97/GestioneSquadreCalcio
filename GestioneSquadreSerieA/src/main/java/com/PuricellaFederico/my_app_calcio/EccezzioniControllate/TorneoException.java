package com.PuricellaFederico.my_app_calcio.EccezzioniControllate;

public class TorneoException extends RuntimeException {

    private String nomeTorneo;

    public TorneoException(String s , String nomeTorneo) {
        super(s);
        this.nomeTorneo = nomeTorneo;
    }

    public String getNomeTorneo() {
        return nomeTorneo;
    }
}
