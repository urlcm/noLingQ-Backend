package com.example.NoLingQ.services.SourceLecture;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.models.SourceMedia;
import com.example.NoLingQ.repository.ISourceLectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceLecturesService implements ISourceLectureService{

    @Autowired
    ISourceLectureRepository SourceLectureRepository;

    @Override
    public SourceLecture SaveSourceLecture(SourceLecture sourceLecture) {
        this.SourceLectureRepository.save(sourceLecture);
        return sourceLecture;
    }

    @Override
    public SourceLecture findSourceLectureById(int id) {
        return this.SourceLectureRepository.findById(id).orElse(null);
    }

}
