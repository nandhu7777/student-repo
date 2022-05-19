package com.sapient.aem.model;

import java.time.LocalDate;
import java.util.List;

import com.sapient.aem.util.Connections;

public class Student extends Person {
	private Long admissionCode;	
	private String className;
//	private List<Integer> marksList;	
	private Integer subject1;
	private Integer subject2;
	private Integer subject3;
	private Integer subject4;
	private Integer subject5;
	private Integer subject6;
	
	private String grade;
	
	public Student() {
		
	}

	public Student(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
			Long admissionCode, String className, Integer subject1, Integer subject2, Integer subject3,
			Integer subject4, Integer subject5, Integer subject6, String grade) {
		super(adharCard, name, birthdate, address, email, mobile);
		this.admissionCode = admissionCode;
		this.className = className;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.subject6 = subject6;
		this.grade = grade;
	}
	

	public Student(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
			Long admissionCode, String className, Integer subject1, Integer subject2, Integer subject3,
			Integer subject4, Integer subject5, Integer subject6) {
		super(adharCard, name, birthdate, address, email, mobile);
		this.admissionCode = admissionCode;
		this.className = className;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.subject6 = subject6;
	}

	public Long getAdmissionCode() {
		return admissionCode;
	}

	public void setAdmissionCode(Long admissionCode) {
		this.admissionCode = admissionCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getSubject1() {
		return subject1;
	}

	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}

	public Integer getSubject2() {
		return subject2;
	}

	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}

	public Integer getSubject3() {
		return subject3;
	}

	public void setSubject3(Integer subject3) {
		this.subject3 = subject3;
	}

	public Integer getSubject4() {
		return subject4;
	}

	public void setSubject4(Integer subject4) {
		this.subject4 = subject4;
	}

	public Integer getSubject5() {
		return subject5;
	}

	public void setSubject5(Integer subject5) {
		this.subject5 = subject5;
	}

	public Integer getSubject6() {
		return subject6;
	}

	public void setSubject6(Integer subject6) {
		this.subject6 = subject6;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		
		this.grade =grade;
		
		
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", className=" + className + ", subject1=" + subject1
				+ ", subject2=" + subject2 + ", subject3=" + subject3 + ", subject4=" + subject4 + ", subject5="
				+ subject5 + ", subject6=" + subject6 + ", grade=" + grade + "]";
	}
}
	
	

