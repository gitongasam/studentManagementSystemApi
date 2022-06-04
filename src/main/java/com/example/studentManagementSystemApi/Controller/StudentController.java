package com.example.studentManagementSystemApi.Controller;

import com.example.studentManagementSystemApi.Entity.Student;
import com.example.studentManagementSystemApi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
public Student saveStudent(Student student){
    return studentService.saveStudent(student);
}
@GetMapping("/allStudents")
public List<Student> getAllStudents(Student student){
        return (List<Student>) studentService.getAllStudents();
  }
  @GetMapping("/getStudentById{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getById(id);
  }
    @DeleteMapping("/getStudentById{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteById(id);
    }
}
