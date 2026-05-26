package com.example.NoLingQ.controller;

import com.example.NoLingQ.services.WordService.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("word-controller")
public class WordController {
    @Autowired
    private WordService wordService;


}
