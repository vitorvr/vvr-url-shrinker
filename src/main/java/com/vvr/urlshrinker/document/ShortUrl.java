package com.vvr.urlshrinker.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shorturl")
public class ShortUrl {

    private String id;
    private String fullUrl;
    private String shrinkedUrl;
    private int clicks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getShrinkedUrl() {
        return shrinkedUrl;
    }

    public void setShrinkedUrl(String shrinkedUrl) {
        this.shrinkedUrl = shrinkedUrl;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}
