package com.example.demo.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping
public class TeacherController {
    TeacherService teacherService = new TeacherService();
    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }




}


