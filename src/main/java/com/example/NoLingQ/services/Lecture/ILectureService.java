package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;

public interface ILectureService {
    public Lecture saveLecture(Lecture lecture);

    public Lecture FindLectureById(int id);
}
