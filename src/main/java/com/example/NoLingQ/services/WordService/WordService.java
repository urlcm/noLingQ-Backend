package com.example.NoLingQ.services.WordService;

import com.example.NoLingQ.models.Word;
import com.example.NoLingQ.repository.IWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService implements IWordService{

    @Autowired
    private IWordRepository wordRepository;
    @Override
    public Word findById(Integer id) {
        return wordRepository.findById(id).orElse(null);
    }

    @Override
    public Word SaveWord(Word word) {
        return this.wordRepository.save(word);
    }

    @Override
    public Word FindByWord(String word) {
        return this.wordRepository.findByWord(word).orElse(null);
    }


}
