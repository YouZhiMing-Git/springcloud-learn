package com.youzm.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/port")
public class PortController {
    @Value("${server.port}")
    private  String port;

    @RequestMapping("/")
    public String index(){
        return "当前端口为"+port;
    }
}
