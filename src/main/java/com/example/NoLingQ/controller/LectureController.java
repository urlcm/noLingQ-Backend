package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.services.DifficultyService.DifficultyService;
import com.example.NoLingQ.services.Lecture.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lecture-controller")
@CrossOrigin(value = "http://localhost:4200")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @PostMapping("/save")
    public Lecture SaveLecture(@RequestBody Lecture lecture){
        return this.lectureService.saveLecture(lecture);
    }

    @GetMapping("/get-lecture/{id}")
    public Lecture getLectureById(@PathVariable int id)
    {
        return this.lectureService.FindLectureById(id);
    }

    @GetMapping("/get-lectures")
    public List<Lecture> GetLectures(){
        return this.lectureService.GetLectures();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        this.lectureService.deleteById(id);
    }

    @PutMapping("/update")
    public Lecture updateLecture(@RequestBody Lecture lecture){
        return this.lectureService.updateLecture(lecture);
    }
}
