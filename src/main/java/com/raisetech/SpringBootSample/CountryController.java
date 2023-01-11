package com.raisetech.SpringBootSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/Japan")
    public String jp(){
        return "こんにちは";
    }

    @GetMapping("/Greece")
    public String gr(){
        return "ヤーサス！";
    }


}
