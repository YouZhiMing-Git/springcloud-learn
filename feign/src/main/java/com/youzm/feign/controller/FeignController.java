package com.youzm.feign.controller;

import com.youzm.feign.entity.Student;
import com.youzm.feign.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/port")
    public String port(){
        return feignProviderClient.port();
    }
}
