package com.infosys.infytel.studentdetails.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.infosys.infytel.studentdetails.entity.Student;

@XmlRootElement(name="Students")
public class StudentDTO  implements Serializable{
	
	@XmlElement
	private long id;
	@XmlElement
	String name;
	@XmlElement
	int age;
	@XmlElement
	String gender;
	@XmlElement
	String PassportNo;
	@XmlElement
	int course_id;
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
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
		return "StudentDTO [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", PassportNo="
				+ PassportNo + ", course_id=" + course_id + "]";
	}

	
	//convert Entioty to DTO
	
	
	
	public static StudentDTO valueOf(Student student) {
		StudentDTO stud= new StudentDTO();
		stud.setId(student.getId());
		stud.setName(student.getName());
		stud.setAge(student.getAge());
		stud.setPassportNo(student.getPassportNo());
		stud.setCourse_id(student.getCourse_id());
		
		return stud;
		
	}
}
