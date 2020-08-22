package com.kundan.service;

import java.util.List;
import java.util.Optional;

import com.kundan.model.Student;


public interface StudentService {

	Integer saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(Integer stdId);
	Optional<Student> getOneStudent(Integer stdId);
	List<Student> getAllStudents();
	boolean isStudentExist(Integer stdId);
}
