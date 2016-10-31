package com.manufacturingplant.main_methods;

import com.manufacturingplant.creators.DepartmentCreator;
import com.manufacturingplant.creators.EmployeeCreator;
import com.manufacturingplant.creators.WorkshopCreator;
import com.manufacturingplant.entities.Department;
import com.manufacturingplant.entities.Workshop;

public class ManufacturingPlanMain {

	public static void main(String[] args) {

		
		DepartmentCreator departmentCreator = new DepartmentCreator();		
		departmentCreator.createDepartments();
		departmentCreator.showAllDepartments();
		
		WorkshopCreator workshopCreator = new WorkshopCreator();
		workshopCreator.createWorkshops();
		workshopCreator.showAllWorkshops();
		
		EmployeeCreator employeeCreator = new EmployeeCreator();		
		employeeCreator.main(args);
//		
	}

}
