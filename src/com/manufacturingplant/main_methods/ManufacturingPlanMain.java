package com.manufacturingplant.main_methods;

import com.manufacturingplant.creators.DepartmentCreator;
import com.manufacturingplant.entities.Department;
import com.manufacturingplant.entities.Workshop;

public class ManufacturingPlanMain {

	public static void main(String[] args) {

//		DepartmentMain departmentMain = new DepartmentMain();
//		departmentMain.main(args);
		DepartmentCreator departmentCreator = new DepartmentCreator();
		departmentCreator.creatingDepartments();
		departmentCreator.showAllDepartments();
	}

}
