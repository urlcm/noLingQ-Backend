package com.example.NoLingQ.services.ProgressService;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;
import com.example.NoLingQ.repository.IProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Long updateCurrentTimeSecs(Progress progressParam) {
        Progress progress;
        if (progressParam.getIdProgress() != null){
            progress = GetProgressById(progressParam.getIdProgress());
            progress.setCurrentTimeSecs(progressParam.getCurrentTimeSecs());
            saveProgress(progress);
            return progress.getCurrentTimeSecs();
        }
        return 0L;
    }

    @Override
    public int updateCurrentPage(Progress progressParam) {
        Progress progress;
        if (progressParam.getIdProgress() != null){
            progress = GetProgressById(progressParam.getIdProgress());
            progress.setCurrentPage(progressParam.getCurrentPage());
            saveProgress(progress);
            return progress.getCurrentPage();
        }
        return 0;
    }


}