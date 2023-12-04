package com.studentSystem.neptun.service;

import com.studentSystem.neptun.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
