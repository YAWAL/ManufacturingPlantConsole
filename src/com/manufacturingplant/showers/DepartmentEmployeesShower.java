package com.manufacturingplant.showers;

import java.util.ArrayList;

import com.manufacturingplant.creators.DepartmentEmployeeCreator;
import com.manufacturingplant.creators.WorkshopEmployeeCreator;
import com.manufacturingplant.entities.DepartamentEmployee;

public class DepartmentEmployeesShower {
	
	public static void main(String[] args) {
		
		DepartmentEmployeeCreator departmentEmployeeCreator = new DepartmentEmployeeCreator();
		departmentEmployeeCreator.createDepartmentEmployees();

		
		
		departmentEmployeeCreator.showAllDepartmentsEmployees();
	}

}
