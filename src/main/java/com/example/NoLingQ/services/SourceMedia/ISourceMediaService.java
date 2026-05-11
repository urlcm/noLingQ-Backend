package com.example.NoLingQ.services.SourceMedia;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.models.SourceMedia;

public interface ISourceMediaService {
    int SaveSourceMedia (SourceMedia sourceMedia);

    SourceMedia FindSourceMediaById(int id);
}
