package com.sapient.aem.model;

import java.time.LocalDate;

public class Teacher extends Person{
	private Integer teacherId;
	private String qualification;
	private String gender;
	private Double salary;

	public Teacher() {

	}



	public Teacher(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
			Integer teacherId, String qualification, String gender, Double salary) {
		super(adharCard, name, birthdate, address, email, mobile);
		this.teacherId = teacherId;
		this.qualification = qualification;
		this.gender = gender;
		this.salary = salary;
	}







	public Teacher(Long adharCard, String name, LocalDate birthdate, String address, String email, Long mobile,
			String qualification, String gender, Double salary) {
		super(adharCard, name, birthdate, address, email, mobile);
		this.qualification = qualification;
		this.gender = gender;
		this.salary = salary;
	}



	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() +"teacherId=" + teacherId + ", qualification=" + qualification + ", gender=" + gender
				+ ", salary=" + salary ;
	}




}
