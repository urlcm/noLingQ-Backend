package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.Word;
import com.example.NoLingQ.services.WordService.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("word-controller")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("/by-word/{word}")
    public Word getWordByWord(@PathVariable("word") String word){
        return this.wordService.FindByWord(word);
    }

    @GetMapping("/by-id/{id}")
    public Word getWordById(@PathVariable("id") int id){
        return this.wordService.findById(id);
    }

    @PostMapping("/save")
    public Word saveWord(@RequestParam Word word){
        return this.wordService.SaveWord(word);
    }



}
