package com.example.NoLingQ.services.SourceLecture;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.repository.ISourceLectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceLecturesService implements ISourceLectureService{

    @Autowired
    ISourceLectureRepository SourceLectureRepository;

    @Override
    public int SaveSourceLecture(SourceLecture sourceLecture) {
        this.SourceLectureRepository.save(sourceLecture);
        return sourceLecture.getIdSourceLecture();
    }

    @Override
    public SourceLecture findSourceLectureById(int id) {
        return this.SourceLectureRepository.findById(id).orElse(null);
    }
}
