package com.example;

import org.springframework.data.annotation.Id;

public class Student {

    @Id
    private Integer regNumber;
	private String Name;
	
	private String Email;
	
	private String College;
	
	private String City;
	
	private Integer Graduation;
	
	private String DOA;

    public Student() {
    }

    public Student(Integer regNumber, String firstName, String lastName) {
        this.regNumber = regNumber;
       
    }

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Integer getGraduation() {
		return Graduation;
	}

	public void setGraduation(Integer graduation) {
		Graduation = graduation;
	}

	public String getDOA() {
		return DOA;
	}

	public void setDOA(String dOA) {
		DOA = dOA;
	}

	public Integer getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(Integer regNumber) {
        this.regNumber = regNumber;
    }

  
}
