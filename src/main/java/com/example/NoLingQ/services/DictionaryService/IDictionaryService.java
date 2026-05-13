package com.example.NoLingQ.services.DictionaryService;

import com.example.NoLingQ.models.DictionarySource;

import java.util.List;

public interface IDictionaryService {
    Integer SaveDictionary(DictionarySource dictionarySource);

    List<DictionarySource> GetDictionaries();

    DictionarySource GetDictionaryById(int id);
}
