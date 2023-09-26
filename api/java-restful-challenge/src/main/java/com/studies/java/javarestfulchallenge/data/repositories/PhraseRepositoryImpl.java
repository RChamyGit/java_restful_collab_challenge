package com.studies.java.javarestfulchallenge.data.repositories;

import com.studies.java.javarestfulchallenge.data.datasources.PhraseDatasourcesLocal;
import com.studies.java.javarestfulchallenge.data.models.PhraseModel;
import com.studies.java.javarestfulchallenge.domain.repositories.PhraseRepository;

public class PhraseRepositoryImpl implements PhraseRepository {

    final PhraseDatasourcesLocal datasourcesPhraseLocal;

    public PhraseRepositoryImpl(PhraseDatasourcesLocal phraseDatasourcesLocal){
        this.datasourcesPhraseLocal = phraseDatasourcesLocal;
    }
    @Override
    public String getPhrase() {
        PhraseModel phraseModel = new PhraseModel();
        return phraseModel.getPhrase();
    }
}
