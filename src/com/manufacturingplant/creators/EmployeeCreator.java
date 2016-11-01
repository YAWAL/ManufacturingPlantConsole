package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.DepartamentEmployee;
import com.manufacturingplant.entities.WorkshopEmployee;

public class EmployeeCreator {
	
//	ArrayList<ArrayList<WorkshopEmployee>> workshopEmployees = new ArrayList<>();

	public static void main(String[] args) {
		
		DepartmentEmployeeCreator departmentEmployeeCreator = new DepartmentEmployeeCreator();
		departmentEmployeeCreator.createDepartmentEmployees();

		WorkshopEmployeeCreator workshopEmployeeCreator = new WorkshopEmployeeCreator();
		workshopEmployeeCreator.createWorkshopEmployees();
		
//		workshopEmployeeCreator.showAllWorkshopEmployees();
	}
	
	

}
