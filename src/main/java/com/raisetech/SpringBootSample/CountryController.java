package com.raisetech.SpringBootSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/japan")
    public String jp(){
        return "こんにちは";
    }
    @GetMapping("/greece")
    public String gr(){
        return "ヤーサス！";
    }
}
