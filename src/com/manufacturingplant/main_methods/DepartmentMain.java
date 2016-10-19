package com.manufacturingplant.main_methods;

import java.util.ArrayList;

import com.manufacturingplant.entities.Department;

public class DepartmentMain{
	

	

	

	public static void main(String[] args) {
		
		ArrayList<Department> departments = new ArrayList<>();

		
		Department HRDepartment = new Department(1, "Human Resourse Department", "Makar Roman Bogdanovich");
		Department designDepartment = new Department(3, "Design Department", "Kazmirchuk Bogdan Yusypovych");
		Department technologyDepartment = new Department(7, "Technology Department",
				"Yablonsky Rostyslav Yaroslavovich");
		Department supplyAndMaterialDepartment = new Department(9, "Supply and materials Department",
				"Prozyralyk Mukola Volodymerovych");
		Department accountDepartment = new Department(11, "Account Department", "Levcovich Ihor Ihorovich");
		Department metrologyDepartment = new Department(15, "Metrology Department", "Zyk Marianna Petrivna");
		Department mechanicalAndMaintenanceDepartment = new Department(17, "Mechanikal and maintenance Department",
				"Dobrynin Petro Ihorovich");
		departments.add(HRDepartment);
		departments.add(designDepartment);
		departments.add(technologyDepartment);
		departments.add(supplyAndMaterialDepartment);
		departments.add(accountDepartment);
		departments.add(metrologyDepartment);
		departments.add(mechanicalAndMaintenanceDepartment);
		
		
	}
}
