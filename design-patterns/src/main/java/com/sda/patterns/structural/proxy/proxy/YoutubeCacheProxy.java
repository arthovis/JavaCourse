package com.sda.patterns.structural.proxy.proxy;

import com.sda.patterns.structural.proxy.media_library.MyVideo;
import com.sda.patterns.structural.proxy.media_library.ThirdPartyYoutubeLib;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib youtubeService;
    private Map<String, MyVideo> cachePopular = new HashMap<>();
    private Map<String, MyVideo> cahcheAll = new HashMap<>();

    public YoutubeCacheProxy(ThirdPartyYoutubeLib youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public Map<String, MyVideo> popularVideos() {
        return null;
    }

    @Override
    public MyVideo getVideo(String videoId) {
        return null;
    }
}
