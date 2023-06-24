package com.example.urlhitcounter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/url")
public class UrlHitController {

    private final UrlHitService urlHitService;

    public UrlHitController(com.example.urlhitcounter.service.UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }

    @GetMapping("/hit")
    @ResponseBody
    public String hitUrl() {
        urlHitService.incrementHitCount();
        return "URL Hit Counter: " + urlHitService.getHitCount();
    }
}
