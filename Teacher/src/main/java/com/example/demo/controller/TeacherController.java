package com.example.demo.controller;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Create Teacher
    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    // Get All Teachers
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    // Get Teacher by ID
    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Integer id) {
        return teacherService.getTeacherById(id);
    }

    // Update Teacher
    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Integer id, @RequestBody Teacher teacher) {
        return teacherService.updateTeacher(id, teacher);
    }

    // Delete Teacher
    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable Integer id) {
        return teacherService.deleteTeacher(id);
    }
}
