package xyz.sadiulhakim.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class SimpleService {

    @Cacheable("waitAndSend")
    public String waitAndSend() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        return "Here you go";
    }
}
