package com.andy.seckill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Echo")
public class EchoController {
    @RequestMapping
    public String Echo(){
        return "echo";
    }
}
