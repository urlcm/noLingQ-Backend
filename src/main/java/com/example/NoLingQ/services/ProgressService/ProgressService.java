package com.example.NoLingQ.services.ProgressService;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;
import com.example.NoLingQ.repository.IProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressService implements IProgressService{

    @Autowired
    private IProgressRepository progressRepository;

    @Override
    public Progress GetProgressById(int id) {
        return this.progressRepository.findById(id).orElse(null);
    }

    @Override
    public Progress GetProgressByLecture(Lecture lecture) {
        return this.progressRepository.findByLecture(lecture);
    }

    @Override
    public Progress saveProgress(Progress progress) {
        return this.progressRepository.save(progress);
    }
}