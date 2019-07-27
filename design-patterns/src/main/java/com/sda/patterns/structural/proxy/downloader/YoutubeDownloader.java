package com.sda.patterns.structural.proxy.downloader;

import com.sda.patterns.structural.proxy.media_library.ThirdPartyYoutubeLib;

public class YoutubeDownloader {
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId){}
    public void renderPopularVideos(){}
}
