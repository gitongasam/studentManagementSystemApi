package com.example.studentManagementSystemApi.Repository;

import com.example.studentManagementSystemApi.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
