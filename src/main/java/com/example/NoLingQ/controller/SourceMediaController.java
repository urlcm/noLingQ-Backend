package com.example.NoLingQ.controller;

import com.example.NoLingQ.models.SourceMedia;
import com.example.NoLingQ.services.SourceMedia.SourceMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("source-media-controller")
@CrossOrigin("http://localhost:4200")
public class SourceMediaController {

    @Autowired
    private SourceMediaService sourceMediaService;

    @PostMapping("/save")
    public SourceMedia SaveSourceMedia(@RequestBody SourceMedia sourceMedia){
        return this.sourceMediaService.SaveSourceMedia(sourceMedia);
    }
}
