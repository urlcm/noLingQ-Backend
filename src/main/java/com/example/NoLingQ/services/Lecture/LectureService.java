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
    public boolean saveLecture(Lecture lecture) {
        this.lectureRespository.save(lecture);
        return true;
    }
}
