package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.DictionarySource;
import com.example.NoLingQ.services.DictionaryService.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("dictionary-controller")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping("/save")
    public int SaveDictionary(@RequestBody DictionarySource dictionarySource)
    {
        int id = this.dictionaryService.SaveDictionary(dictionarySource);
        return id;
    }

    @GetMapping("/get-dictionary/{id}")
    public DictionarySource GetDictionaryById(@PathVariable Integer id){
        return this.dictionaryService.GetDictionaryById(id);
    }

    @GetMapping("/get-dictionaries")
    public List<DictionarySource> GetDictionary() {
        return this.dictionaryService.GetDictionaries();
    }
}
