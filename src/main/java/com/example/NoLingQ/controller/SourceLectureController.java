package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.services.SourceLecture.SourceLecturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("source-lecture-controller")
@CrossOrigin(value = "http://localhost:4200")
public class SourceLectureController {
    @Autowired
    private SourceLecturesService sourceLecturesService;

    @PostMapping("/save")
    public SourceLecture SaveSourceLecture(@RequestBody SourceLecture sourceLecture){
        return this.sourceLecturesService.SaveSourceLecture(sourceLecture);
    }

    @GetMapping("/get-lecture/{id}")
    public SourceLecture GetSourceLectureById(@PathVariable int id){
        return this.sourceLecturesService.findSourceLectureById(id);
    }


}
