package com.kundan.util;

import org.springframework.stereotype.Component;

import com.kundan.model.Student;

@Component
public class StudentUtil {
	
	public void mapToActualObject(Student actualStudent, Student student) {
		if(student.getStdName()!= null) {
			actualStudent.setStdName(student.getStdName());
		}	
		actualStudent.setStdFee(student.getStdFee());
		actualStudent.setStdCourse(student.getStdCourse());
		if(student.getStdEmail()!= null) {
			actualStudent.setStdEmail(student.getStdEmail());
		}	
		actualStudent.setStdAddr(student.getStdAddr());
	}		
}
