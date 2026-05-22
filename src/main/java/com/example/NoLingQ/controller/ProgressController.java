package com.example.NoLingQ.controller;

import com.example.NoLingQ.services.ProgressService.ProgressService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("progress-controller")
public class ProgressController {
    private ProgressService progressService;

    @GetMapping("/get-progress/{id}")
    public void GetProgressById(@PathVariable int id){
        this.progressService.GetProgressById(id);
    }
}
