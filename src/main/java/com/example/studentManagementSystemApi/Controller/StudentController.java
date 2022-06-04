package com.example.studentManagementSystemApi.Controller;

import com.example.studentManagementSystemApi.Entity.Student;
import com.example.studentManagementSystemApi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
public Student saveStudent(Student student){
    return studentService.saveStudent(student);
}
@GetMapping("/allStudents")
public Student getAllStudents(Student student){
        return studentService.getAllStudents();
  }

}
