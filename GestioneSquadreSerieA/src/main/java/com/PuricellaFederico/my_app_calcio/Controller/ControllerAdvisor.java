package com.PuricellaFederico.my_app_calcio.Controller;

import com.PuricellaFederico.my_app_calcio.EccezzioniControllate.GicoatoreException;
import com.PuricellaFederico.my_app_calcio.EccezzioniControllate.SquadraException;
import com.PuricellaFederico.my_app_calcio.EccezzioniControllate.TorneoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SquadraException.class)
    public ResponseEntity<Map<String , String>> squadraException(SquadraException ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage());
        return ResponseEntity.badRequest().body(errore);
    }

    @ExceptionHandler(TorneoException.class)
    public ResponseEntity<Map<String , String>> TorneoException(TorneoException ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage().concat(" ").concat(ex.getNomeTorneo()));
        return ResponseEntity.badRequest().body(errore);
    }

    @ExceptionHandler(GicoatoreException.class)
    public ResponseEntity<Map<String , String>> GiocatoreException(GicoatoreException ex , WebRequest request) {
        HashMap<String , String> errore = new HashMap<>();
        errore.put("Error : " , ex.getMessage().concat(" ").concat(ex.getName()).concat(" ").concat(ex.getSurname()));
        return ResponseEntity.badRequest().body(errore);
    }

}
