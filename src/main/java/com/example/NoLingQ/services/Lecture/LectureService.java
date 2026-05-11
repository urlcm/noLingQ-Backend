package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.repository.LectureRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectureService implements ILectureService{
    @Autowired
    private LectureRespository lectureRespository;

    @Override
    public Lecture saveLecture(Lecture lecture) {
        this.lectureRespository.save(lecture);
        return lecture;
    }

    @Override
    public Lecture FindLectureById(int id) {
        return this.lectureRespository.findById(id).orElse(null);
    }
}
