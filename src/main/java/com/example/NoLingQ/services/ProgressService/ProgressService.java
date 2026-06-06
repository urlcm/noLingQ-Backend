package com.example.NoLingQ.services.ProgressService;

import com.example.NoLingQ.models.Progress;
import com.example.NoLingQ.repository.IProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProgressService implements IProgressService{

    @Autowired
    private IProgressRepository progressRepository;

    @Override
    public Progress GetProgressById(int id) {
        return this.progressRepository.findById(id).orElse(null);
    }

    @Override
    public Progress GetProgressByLecture(int id) {
        return this.progressRepository.findByLecture(id);
    }

    @Override
    public Progress saveProgress(Progress progress) {
        return this.progressRepository.save(progress);
    }
}