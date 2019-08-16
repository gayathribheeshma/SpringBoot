package com.infosys.infytel.studentdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name ="Student")
@JacksonXmlRootElement(localName ="Student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private long id;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	int age;
	@Column(nullable = false)
	String gender;
	@Column(nullable = false)
	String PassportNo;
	@Column(nullable = false)
	int course_id;
	public Student(int id, String name, int age, String gender, String passportNo, int course_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		PassportNo = passportNo;
		this.course_id = course_id;
	}
	
	
	public Student() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassportNo() {
		return PassportNo;
	}


	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", PassportNo="
				+ PassportNo + ", course_id=" + course_id + "]";
	}
	
	
	

}
