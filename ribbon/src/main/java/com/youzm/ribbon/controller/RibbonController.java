package com.youzm.ribbon.controller;


import com.youzm.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    String url_base="http://localhost:8010/student/";



    @GetMapping("/findAll")
    public Collection<Student> findAll() {
//        return restTemplate.getForEntity(url_base+"findAll", Collection.class).getBody();
        return  restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/port/",String.class);
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject(url_base+"findAll", Collection.class);
    }


    @GetMapping("/2/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity(url_base+"{id}",Student.class,id).getBody();
    }
    @GetMapping("/{id}")
    public Student findById2(@PathVariable("id") long id) {
        return restTemplate.getForObject(url_base+"{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity(url_base+"save",student,Void.class);
    }
    @PostMapping("2/save")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject(url_base+"save",student,null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put(url_base+"update",student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete(url_base+"{id}",id);
    }

}
