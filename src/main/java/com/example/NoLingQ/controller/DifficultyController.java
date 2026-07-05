package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.Difficulty;
import com.example.NoLingQ.services.DifficultyService.DifficultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("difficulty-controller")
@CrossOrigin(value = "http://localhost:4200")
public class DifficultyController {
    @Autowired
    private DifficultyService difficultyService;

    @GetMapping("/get-difficulty/{id}")
    public Difficulty getDifficulty(@PathVariable int id){
        return this.difficultyService.getDifficulty(id);
    }
}
