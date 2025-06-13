package com.example.demo;

import com.example.demo.teacher.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SchoolBridgeDraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolBridgeDraftApplication.class, args);
	}



}
