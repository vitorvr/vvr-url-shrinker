package com.vvr.urlshrinker.service;

import com.vvr.urlshrinker.document.ShortUrl;
import com.vvr.urlshrinker.repository.ShortUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ShortUrlServiceImpl implements ShortUrlService {

    @Autowired
    ShortUrlRepository repository;

    @Override
    public ShortUrl create(ShortUrl shortUrl) {
        return repository.save(shortUrl);
    }

    @Override
    public Collection<ShortUrl> getAll() {
        return repository.findAll();
    }


    public ShortUrl getByShrinkedUrl(String shrinkedUrl) {
        return repository.findByShrinkedUrl(shrinkedUrl);
    }

    @Override
    public void detele(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(ShortUrl shortUrl) {
        repository.save(shortUrl);
    }
}
