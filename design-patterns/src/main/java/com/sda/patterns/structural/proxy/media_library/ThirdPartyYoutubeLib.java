package com.sda.patterns.structural.proxy.media_library;

import java.util.Map;

public interface ThirdPartyYoutubeLib {
    Map<String, MyVideo>popularVideos();
    MyVideo getVideo(String videoId);
}
