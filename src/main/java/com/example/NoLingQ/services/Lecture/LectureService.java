package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.repository.ISourceLectureRepository;
import com.example.NoLingQ.repository.ISourceMediaRepository;
import com.example.NoLingQ.repository.LectureRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService implements ILectureService{
    @Autowired
    private LectureRespository lectureRespository;

    @Autowired
    private ISourceMediaRepository sourceMediaRepository;

    @Autowired
    private ISourceLectureRepository sourceLectureRepository;

    @Override
    public Lecture saveLecture(Lecture lecture) {
        System.out.println("Lecture recibida: " + lecture);
        System.out.println("SourceMedia: " + lecture.getSourceMedia());
        System.out.println("SourceMedia ID: " + lecture.getSourceMedia().getIdSourceMedia());
        System.out.println("SourceLecture ID: " + lecture.getSourceLecture().getIdSourceLecture());
        if(lecture.getSourceMedia() != null){
            lecture.setSourceMedia(
                    sourceMediaRepository.getReferenceById(lecture.getSourceMedia().getIdSourceMedia())
            );
        }

        if (lecture.getSourceLecture() != null) {
            lecture.setSourceLecture(
                    sourceLectureRepository.getReferenceById(lecture.getSourceLecture().getIdSourceLecture())
            );
        }

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
