package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.repository.LectureRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Lecture> GetLectures() {
        return this.lectureRespository.findAll();
    }


}
