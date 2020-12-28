package com.youzm.eurekaclient.repository;

import com.youzm.eurekaclient.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void deleteById(long id);

    public void saveOrUpdate(Student student);
}
