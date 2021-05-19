package com.youzm.zipkinclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zipkin")
public class ZipkinController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/index")
    public String index(){
        return port;
    }
}
