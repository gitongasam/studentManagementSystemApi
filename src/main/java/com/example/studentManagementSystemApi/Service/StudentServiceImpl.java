package com.example.studentManagementSystemApi.Service;

import com.example.studentManagementSystemApi.Entity.Student;
import com.example.studentManagementSystemApi.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getAllStudents() {
        return (Student) studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).get();
    }
}
