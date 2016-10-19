package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.DepartamentEmployee;
import com.manufacturingplant.entities.WorkshopEmployee;

public class EmployeeCreator {
	
	ArrayList<DepartamentEmployee> departamentEmployees = new ArrayList<>();
	
	ArrayList<WorkshopEmployee> workshopEmployees = new ArrayList<>();
	
	DepartmentCreator departmentCreator;
	
	//CREATING OF DEPARTMENT EMPLOYEES
	DepartamentEmployee employee1 = new DepartamentEmployee(1, "Vasyl", "Panasuk", "Igorovich", "Lviv", "10.01.1986", "067 345 12 34", "Design Enginner", 2000, "15.08.2011");
//	DepartamentEmployee DepartamentEmployee = new DepartamentEmployee(2, "test", "test", "test", "Lviv", "test", "098 765 34 21", "Engineer technologist", 1500, "test");
//	employee1.setDepartment(designDepartment);
	
}
