package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.NONE)
public class Employee implements Serializable {
	
	
	@XmlAttribute
	private int Empid;
	
	@XmlElement
	private String firsName;
	@XmlElement
	private String lastName;
	@XmlElement
	private String email;
	
	
	
	public Employee(int empid, String firsName, String lastName, String email) {
		super();
		Empid = empid;
		this.firsName = firsName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Employee() {
		
	}
	
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", firsName=" + firsName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
	
	

}
