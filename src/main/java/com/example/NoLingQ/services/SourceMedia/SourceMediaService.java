package com.example.NoLingQ.services.SourceMedia;

import com.example.NoLingQ.models.SourceLecture;
import com.example.NoLingQ.models.SourceMedia;
import org.springframework.beans.factory.annotation.Autowired;

public class SourceMediaService implements ISourceMediaService{

    @Autowired
    private ISourceMediaService sourceMediaService;

    @Override
    public int SaveSourceMedia(SourceMedia sourceMedia) {
        this.sourceMediaService.SaveSourceMedia(sourceMedia);
        return sourceMedia.getIdSourceMedia();
    }

    @Override
    public SourceMedia FindSourceMediaById(int id) {
        return this.sourceMediaService.FindSourceMediaById(id);
    }
}
