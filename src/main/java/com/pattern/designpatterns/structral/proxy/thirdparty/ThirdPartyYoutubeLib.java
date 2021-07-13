package com.pattern.designpatterns.structral.proxy.thirdparty;

import com.pattern.designpatterns.structral.proxy.video.Video;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
