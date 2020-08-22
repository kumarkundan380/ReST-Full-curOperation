package com.kundan.util;

import org.springframework.stereotype.Component;

import com.kundan.model.Student;

@Component
public class StudentUtil {
	
	public void mapOneStudentToOther(Student actualStudent, Student student) {
		
		actualStudent.setStdName(student.getStdName());
		actualStudent.setStdEmail(student.getStdEmail());
		actualStudent.setStdAddr(student.getStdAddr());
		actualStudent.setStdCourse(student.getStdCourse());
		actualStudent.setStdFee(student.getStdFee());
	}
}
