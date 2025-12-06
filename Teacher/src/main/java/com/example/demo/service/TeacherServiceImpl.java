package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository repo;

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return repo.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return repo.findAll();
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Teacher updateTeacher(Integer id, Teacher teacher) {
        teacher.setId(id);
        return repo.save(teacher);
    }

    @Override
    public String deleteTeacher(Integer id) {
        repo.deleteById(id);
        return "Teacher Deleted Successfully";
    }
}

