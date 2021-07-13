package com.pattern.designpatterns.structral.facade.mixer;

import com.pattern.designpatterns.structral.facade.other.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
