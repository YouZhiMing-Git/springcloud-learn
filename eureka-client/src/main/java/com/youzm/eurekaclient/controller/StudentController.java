package com.youzm.eurekaclient.controller;

import com.youzm.eurekaclient.entity.Student;
import com.youzm.eurekaclient.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return  studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }

}
