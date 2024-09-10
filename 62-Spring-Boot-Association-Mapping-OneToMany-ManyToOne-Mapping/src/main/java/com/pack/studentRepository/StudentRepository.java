package com.pack.studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
