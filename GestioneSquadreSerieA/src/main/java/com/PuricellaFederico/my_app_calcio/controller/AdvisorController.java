package com.puricellafederico.my_app_calcio.controller;

import com.puricellafederico.my_app_calcio.eccezzionicontrollate.ExceptionGicoatore;
import com.puricellafederico.my_app_calcio.eccezzionicontrollate.ExceptionSquadra;
import com.puricellafederico.my_app_calcio.eccezzionicontrollate.ExceptionTorneo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AdvisorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ExceptionSquadra.class)
    public ResponseEntity<Map<String , String>> squadraException(ExceptionSquadra ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage());
        return ResponseEntity.badRequest().body(errore);
    }

    @ExceptionHandler(ExceptionTorneo.class)
    public ResponseEntity<Map<String , String>> TorneoException(ExceptionTorneo ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage().concat(" ").concat(ex.getNomeTorneo()));
        return ResponseEntity.badRequest().body(errore);
    }

    @ExceptionHandler(ExceptionGicoatore.class)
    public ResponseEntity<Map<String , String>> GiocatoreException(ExceptionGicoatore ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage().concat(" ").concat(ex.getName()).concat(" ").concat(ex.getSurname()));
        return ResponseEntity.badRequest().body(errore);
    }

}
