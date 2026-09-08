package com.example.NoLingQ.services.ProgressService;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;

import java.util.Optional;

public interface IProgressService {
    Progress GetProgressById(int id);

    Progress GetProgressByLecture(Lecture lecture);

    Progress saveProgress(Progress progress);

    Long updateCurrentTimeSecs(Progress progressParam);

    int updateCurrentPage(Progress progress);

}
