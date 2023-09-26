package com.studies.java.javarestfulchallenge.domain.usecases;

import com.studies.java.javarestfulchallenge.domain.repositories.PhraseRepository;

public class GetPhrase {
    final PhraseRepository phraseRepository;

    public GetPhrase(PhraseRepository phraseRepository){
        this.phraseRepository = phraseRepository;
    }

    public String Call(){
        return phraseRepository.getPhrase();
    }
}
