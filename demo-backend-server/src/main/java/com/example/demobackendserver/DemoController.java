package com.example.demobackendserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class DemoController {

    @GetMapping("/test1")
    public Mono<String> timeLimitTest() {
        return Mono.just("test time limit")
                .delayElement(Duration.ofSeconds(2));
    }

    @GetMapping("/test2")
    public Mono<String> rateLimitTest() {
        return Mono.just("test rate limit")
                .delayElement(Duration.ofMillis(300));
    }


}
