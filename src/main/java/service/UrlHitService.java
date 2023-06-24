package com.example.urlhitcounter.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private int hitCount = 0;

    public void incrementHitCount() {
        hitCount++;
    }

    public int getHitCount() {
        return hitCount;
    }
}
