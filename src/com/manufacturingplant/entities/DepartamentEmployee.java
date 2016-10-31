package com.manufacturingplant.entities;

import java.util.Date;

import com.manufacturingplant.main_methods.DepartmentMain;

/**
 * Created by VYA on 07.05.2016.
 */

public class DepartamentEmployee {
    
    private int id;

    private String name;

    private String lastName;

//    private String midlName;

    private String adress;

    private String dateOfBirdth;

    private String phoneNumber;

    private String position;
    
    private int salary;
    
    private String startDate;

//    private Department department;

    public DepartamentEmployee() {
    }

	
//my constructor
	public DepartamentEmployee(int id, String name, String lastName, String adress, String dateOfBirdth, String phoneNumber,
		String position, int salary, String startDate) {
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.adress = adress;
	this.dateOfBirdth = dateOfBirdth;
	this.phoneNumber = phoneNumber;
	this.position = position;
	this.salary = salary;
	this.startDate = startDate;
}


//DELETE THIS CONSTRUCTORS IF NOT USE
//	public DepartamentEmployee(int id, String name, String lastName, String midlName, String adress,
//			String dateOfBirdth, String phoneNumber, String position, int salary, String startDate) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.lastName = lastName;
//		this.midlName = midlName;
//		this.adress = adress;
//		this.dateOfBirdth = dateOfBirdth;
//		this.phoneNumber = phoneNumber;
//		this.position = position;
//		this.salary = salary;
//		this.startDate = startDate;
//	}
//	
//	public DepartamentEmployee(int id, String name, String lastName, String midlName, String adress,
//			String dateOfBirdth, String phoneNumber, String position, int salary, String startDate,
//			Department department) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.lastName = lastName;
//		this.midlName = midlName;
//		this.adress = adress;
//		this.dateOfBirdth = dateOfBirdth;
//		this.phoneNumber = phoneNumber;
//		this.position = position;
//		this.salary = salary;
//		this.startDate = startDate;
//		this.department = department;
//	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

//	public String getMidlName() {
//		return midlName;
//	}

	public String getAdress() {
		return adress;
	}

	public String getDateOfBirdth() {
		return dateOfBirdth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}

	public String getStartDate() {
		return startDate;
	}

//	public Department getDepartment() {
//		return department;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public void setMidlName(String midlName) {
//		this.midlName = midlName;
//	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setDateOfBirdth(String dateOfBirdth) {
		this.dateOfBirdth = dateOfBirdth;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

//	public void setDepartment(Department department) {
//		this.department = department;
//	}

    //TODO add equals() and hashCode()
	
	@Override
	public String toString() {
		return "ІТР: ІД=" + id + ", ІМЯ___" + name + ", ПРІЗВИЩЕ___" + lastName + ", АДРЕСА___" + adress + ", ДАТА НАРОДЖЕННЯ___" + dateOfBirdth + ", НОМЕР ТЕЛЕФОНУ___" + phoneNumber
				+ ", ПОСАДА___" + position + ", ОКЛАД___" + salary + ", ПОЧАВ/ЛА ПРАЦЮВАТИ___" + startDate;
	}

	
}
