package com.example.demo.teacher;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("1", "John", "<EMAIL>", "0123456789", "123456789", LocalDate.now()));
        teachers.add(new Teacher("2", "Jane", "<EMAIL>", "0123456789", "123456789", LocalDate.now()));
        return teachers;
    }
}
