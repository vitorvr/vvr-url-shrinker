package com.vvr.urlshrinker.controller;

import com.vvr.urlshrinker.document.ShortUrl;
import com.vvr.urlshrinker.service.ShortUrlService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@RestController
@RequestMapping(value="/api/v1")
public class ShortUrlController {

    static final int SHORT_URL_LENGTH = 7;

    @Autowired
    ShortUrlService service;

    @PostMapping(value = "/shorturl")
    public ShortUrl create(@RequestBody ShortUrl shortUrl) {
        shortUrl.setShrinkedUrl(RandomStringUtils.randomAlphanumeric(SHORT_URL_LENGTH));
        return service.create(shortUrl);
    }

    @GetMapping(value = "/shorturl")
    public Collection<ShortUrl> getAll(){
        return service.getAll();
    }

    @GetMapping(value =  "/shorturl/{shrinkedurl}")
    public void getFullUrl(@PathVariable("shrinkedurl") String shrinkedurl, HttpServletResponse response) throws IOException {
        ShortUrl shortUrl =  service.getByShrinkedUrl(shrinkedurl);
        response.sendRedirect(shortUrl.getFullUrl());
    }
}
