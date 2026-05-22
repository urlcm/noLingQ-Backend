package com.example.NoLingQ.controller;

import com.example.NoLingQ.services.Text.ReadTextService;
import com.example.NoLingQ.util.SlashReplaceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("text-controller")
@CrossOrigin(value = "http://localhost:4200")
public class TextController {
    @Autowired
    private ReadTextService readTextService;

    @GetMapping("/extract-text")
    public String getText(@RequestParam("path") String path, @RequestParam("page") Integer page){
        path = SlashReplaceUtil.slashReplace(path);
        String text = this.readTextService.ExtractText(path,page);
        return text;
    }

    @GetMapping("/replace")
    public String replace(@RequestParam("r") String r){
        return SlashReplaceUtil.slashReplace(r);
    }
}
