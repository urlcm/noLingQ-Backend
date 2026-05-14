package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;

import java.util.List;

public interface ILectureService {
    public Lecture saveLecture(Lecture lecture);

    public Lecture FindLectureById(int id);

    public List<Lecture> GetLectures();
}
