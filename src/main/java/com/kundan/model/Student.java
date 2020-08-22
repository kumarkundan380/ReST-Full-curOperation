package com.kundan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_rest")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "std_id")
	private Integer stdId;
	
	@Column(name = "std_name")
	private String stdName;
	
	@Column(name = "std_fee")
	private Double stdFee;
	
	@Column(name = "std_email")
	private String stdEmail;
	
	@Column(name = "std_course")
	private String stdCourse;
	
	@Column(name = "std_addr")
	private String stdAddr;

}
