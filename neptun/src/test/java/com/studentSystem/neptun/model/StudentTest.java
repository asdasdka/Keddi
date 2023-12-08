package com.studentSystem.neptun.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentGetterSetter() {
        // Arrange
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setPassword("pass123");
        student.setDepartment("Computer Science");

        // Act
        int id = student.getId();
        String name = student.getName();
        String password = student.getPassword();
        String department = student.getDepartment();

        // Assert
        Assertions.assertEquals(1, id);
        Assertions.assertEquals("John", name);
        Assertions.assertEquals("pass123", password);
        Assertions.assertEquals("Computer Science", department);
    }
}