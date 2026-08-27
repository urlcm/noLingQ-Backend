package com.example.NoLingQ.controller;

import com.example.NoLingQ.services.AudioService.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("audio-controller")
@CrossOrigin(value = "http://localhost:4200")
public class AudioController {

    @Autowired
    private AudioService audioService;

    @GetMapping("/get-audio/{name}")
    public ResponseEntity<Resource> getAudio(@PathVariable String name){
        Resource audio = audioService.getAudio(name);

        if(audio == null || !audio.exists()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().
                header(HttpHeaders.CONTENT_TYPE, "audio/mpeg").
                body(audio);
    }


}
