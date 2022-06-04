package com.example.studentManagementSystemApi.Service;

import com.example.studentManagementSystemApi.Entity.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student getAllStudents();

    Student getById(Long id);
}
