package com.example.NoLingQ.services.SourceLecture;

import com.example.NoLingQ.models.SourceLecture;

public interface ISourceLectureService {
     int SaveSourceLecture(SourceLecture sourceLecture);

     SourceLecture findSourceLectureById(int id);

}
