package com.studies.java.javarestfulchallenge.data.models;

import com.studies.java.javarestfulchallenge.domain.entities.Phrase;

public class PhraseResponseModel {

    int code;
    String message;

    PhraseModel dataModel = new PhraseModel();
    private String phrase;
    public PhraseResponseModel(int code, String message) {
        super();
        this.code = code;
        this.message = message;
        this.phrase = dataModel.getPhrase();
    }
    public String getPhrase() {
        return phrase;
    }
}
