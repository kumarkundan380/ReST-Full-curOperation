package com.kundan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kundan.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
