package com.example.NoLingQ.services.SourceMedia;

import com.example.NoLingQ.models.SourceMedia;
import com.example.NoLingQ.repository.ISourceMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceMediaService implements ISourceMediaService{

    @Autowired
    public ISourceMediaRepository sourceMediaRepository;

    @Override
    public int SaveSourceMedia(SourceMedia sourceMedia) {
        this.sourceMediaRepository.save(sourceMedia);
        return sourceMedia.getIdSourceMedia();
    }

    @Override
    public SourceMedia FindSourceMediaById(int id) {
        return this.sourceMediaRepository.findById(id).orElse(null);
    }
}
