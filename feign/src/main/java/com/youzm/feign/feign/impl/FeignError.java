package com.youzm.feign.feign.impl;

import com.youzm.feign.entity.Student;
import com.youzm.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String port() {
        return "服务器维护中";
    }
}
