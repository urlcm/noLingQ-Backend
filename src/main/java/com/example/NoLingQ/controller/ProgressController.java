package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;
import com.example.NoLingQ.services.ProgressService.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("progress-controller")
public class ProgressController {
    @Autowired
    private ProgressService progressService;

    @GetMapping("/get-progress/{id}")
    public Progress GetProgressById(@PathVariable int id){
        return this.progressService.GetProgressById(id);
    }

    @GetMapping("/get-progress-by-lecture/{id}")
    public Progress getProgressByLecture(@PathVariable int id) {
        Lecture lecture = new Lecture();
        lecture.setIdLecture(id);
        return this.progressService.GetProgressByLecture(lecture);
    }

    @PostMapping("/save")
    public Progress saveProgress(@RequestBody Progress progress){
        return this.progressService.saveProgress(progress);
    }
}
