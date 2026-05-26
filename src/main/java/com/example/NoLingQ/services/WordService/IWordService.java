package com.example.NoLingQ.services.WordService;

import com.example.NoLingQ.models.Word;

public interface IWordService{
    Word findById(Integer id);

    Word SaveWord(Word word);
}
