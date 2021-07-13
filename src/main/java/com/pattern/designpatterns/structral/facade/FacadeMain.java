package com.pattern.designpatterns.structral.facade;

import com.pattern.designpatterns.structral.facade.other.VideoConversionFacade;

import java.io.File;

public class FacadeMain {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
