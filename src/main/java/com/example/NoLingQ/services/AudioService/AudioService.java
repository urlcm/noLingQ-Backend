package com.example.NoLingQ.services.AudioService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class AudioService implements IAudioService{

    @Override
    public Resource getAudio(String name) {
        Path filePath = Paths.get(name);
        Resource resource = new FileSystemResource(filePath);

        if(!resource.exists())
            return null;

        return resource;
    }
}
