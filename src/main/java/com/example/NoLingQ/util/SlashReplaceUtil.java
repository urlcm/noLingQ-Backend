package com.example.NoLingQ.util;

public class SlashReplaceUtil {

    private SlashReplaceUtil(){}

    public static String slashReplace(String path){
        return path.replace("%5C","/");
    }
}
