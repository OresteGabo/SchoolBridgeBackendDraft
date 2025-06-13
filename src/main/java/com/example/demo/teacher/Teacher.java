package com.example.demo.teacher;

import java.time.LocalDate;

public class Teacher {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String idNumber;
    private LocalDate dateOfBirth;

    public Teacher(String id, String name, String email, String phone, String idNumber, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Teacher(String name, String email, String phone, String idNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}
