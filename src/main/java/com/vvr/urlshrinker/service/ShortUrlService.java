package com.vvr.urlshrinker.service;

import com.vvr.urlshrinker.document.ShortUrl;

import java.util.Collection;
import java.util.Optional;

public interface ShortUrlService {
    public ShortUrl create(ShortUrl shortUrl);
    public Collection<ShortUrl> getAll();
    public ShortUrl getByShrinkedUrl(String shrinkedUrl);
    public void detele(int id);
    public void update(ShortUrl shortUrl);
}
