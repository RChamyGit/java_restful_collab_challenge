package com.studies.java.javarestfulchallenge.data.datasources.impl;

import com.studies.java.javarestfulchallenge.data.datasources.PhraseDatasourcesLocal;
import com.studies.java.javarestfulchallenge.data.models.PhraseModel;

public class PhraseDatasourcesLocalImpl implements PhraseDatasourcesLocal {
    @Override
    public String getPhrase() {
        return "Hello World!";
    }
}
