package com.example.NoLingQ.services.Lecture;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.models.SourceMedia;
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

    @Override
    public void deleteById(int id) {
        this.lectureRespository.deleteById(id);
    }

    @Override
    public Lecture updateLecture(Lecture lecture) {
        SourceLecture sourceLecture;
        SourceMedia sourceMedia;
        if(lecture.getSourceLecture() != null){
            sourceLecture = sourceLectureRepository.findById(lecture.getSourceLecture().getIdSourceLecture()).orElse(null);
            sourceLecture.setUrlSource(lecture.getSourceLecture().getUrlSource());
        }

        if (lecture.getSourceMedia() != null) {
            sourceMedia = sourceMediaRepository.findById(lecture.getSourceMedia().getIdSourceMedia()).orElse(null);
            sourceMedia.setUrlSource(lecture.getSourceMedia().getUrlSource());
            sourceMedia.setType(lecture.getSourceMedia().getType());
        }

        this.lectureRespository.save(lecture);
        return lecture;
    }


}
