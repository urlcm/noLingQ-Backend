package com.example.NoLingQ.services.AudioService;

import org.springframework.core.io.Resource;

public interface IAudioService {
    Resource getAudio(String path);
}
