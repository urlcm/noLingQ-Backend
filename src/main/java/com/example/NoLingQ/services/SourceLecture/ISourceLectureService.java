package com.example.NoLingQ.services.SourceLecture;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.models.SourceMedia;

public interface ISourceLectureService {
     SourceLecture SaveSourceLecture(SourceLecture sourceLecture);

     SourceLecture findSourceLectureById(int id);

}
