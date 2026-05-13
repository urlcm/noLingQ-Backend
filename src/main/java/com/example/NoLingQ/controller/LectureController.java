package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.services.Lecture.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lecture-controller")
@CrossOrigin(value = "http://localhost:4200")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @PostMapping("/save")
    public Lecture SaveLecture(@RequestBody Lecture lecture){
        return lectureService.saveLecture(lecture);
    }
}
