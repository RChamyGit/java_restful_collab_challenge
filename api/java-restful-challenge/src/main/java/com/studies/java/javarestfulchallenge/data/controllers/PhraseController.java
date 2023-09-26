package com.studies.java.javarestfulchallenge.data.controllers;

import com.studies.java.javarestfulchallenge.data.models.PhraseModel;
import com.studies.java.javarestfulchallenge.data.models.PhraseRequestModel;
import com.studies.java.javarestfulchallenge.data.models.PhraseResponseModel;
import com.studies.java.javarestfulchallenge.domain.usecases.GetPhrase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    final GetPhrase getPhrase;


    PhraseController(GetPhrase getPhrase) {
        this.getPhrase = getPhrase;
    }
    @CrossOrigin(origins = "http://10.0.0.179:8080")
    @GetMapping ("/phrase")
    public ResponseEntity<PhraseResponseModel> get() {

        try {
            getPhrase.Call();

            return new ResponseEntity<PhraseResponseModel>(new PhraseResponseModel(HttpStatus.OK.value(), HttpStatus.OK.name()),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}