package com.example.NoLingQ.services.SourceLecture;

import com.example.NoLingQ.models.SourceLecture;

public interface ISourceLectureService {
    public int SaveSourceLecture(SourceLecture sourceLecture);

    public SourceLecture findSourceLectureById(int id);
}
