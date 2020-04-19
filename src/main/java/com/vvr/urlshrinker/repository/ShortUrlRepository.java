package com.vvr.urlshrinker.repository;

import com.vvr.urlshrinker.document.ShortUrl;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortUrlRepository extends MongoRepository<ShortUrl, Integer> {
    public ShortUrl findByShrinkedUrl(final String shrinkedUrl);
}
