package com.youzm.feign.feign;

import com.youzm.feign.entity.Student;
import com.youzm.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider" ,fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/port/")
    public String port();
}
