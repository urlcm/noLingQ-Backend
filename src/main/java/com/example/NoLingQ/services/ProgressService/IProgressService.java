package com.example.NoLingQ.services.ProgressService;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;

public interface IProgressService {
    Progress GetProgressById(int id);

    Progress GetProgressByLecture(Lecture lecture);

    Progress saveProgress(Progress progress);
}
