package com.redesocial.redesocial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class Aleatorio {
    
    @RequestMapping("/aleatorio")
    public int aleatorio() {
        Random random = new Random();
        return random.nextInt();
    }
}
