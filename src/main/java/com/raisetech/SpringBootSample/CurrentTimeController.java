package com.raisetech.SpringBootSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CurrentTimeController {
    @GetMapping("/currentTime")
    public LocalDateTime currentTime (){
        return  LocalDateTime.now();
    }
}
