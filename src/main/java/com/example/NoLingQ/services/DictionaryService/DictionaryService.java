package com.example.NoLingQ.services.DictionaryService;

import com.example.NoLingQ.models.DictionarySource;
import com.example.NoLingQ.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService{

    @Autowired
    private IDictionaryRepository dictionaryRepository;

    @Override
    public Integer SaveDictionary(DictionarySource dictionarySource) {
        this.dictionaryRepository.save(dictionarySource);
        return dictionarySource.getIdDictionary();
    }

    @Override
    public List<DictionarySource> GetDictionaries() {
        return this.dictionaryRepository.findAll();
    }

    @Override
    public DictionarySource GetDictionaryById(int id) {
        return this.dictionaryRepository.findById(id).orElse(null);
    }
}
