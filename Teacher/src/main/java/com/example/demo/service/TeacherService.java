package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Teacher;

public interface TeacherService {

    Teacher addTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(Integer id);

    Teacher updateTeacher(Integer id, Teacher teacher);

    String deleteTeacher(Integer id);
}

