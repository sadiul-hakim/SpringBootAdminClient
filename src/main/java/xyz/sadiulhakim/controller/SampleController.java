package xyz.sadiulhakim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {
    private final SimpleService simpleService;

    public SampleController(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }

    @GetMapping("/lazy")
    public String lazy() throws InterruptedException {
        return simpleService.waitAndSend();
    }
}
