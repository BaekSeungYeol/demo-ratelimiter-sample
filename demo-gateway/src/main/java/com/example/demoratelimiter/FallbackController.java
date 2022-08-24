package com.example.demoratelimiter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


    @GetMapping("/defaultFallBack")
    public String rateLimitFallBackTest() {
        return "default FallBack";
    }

}
