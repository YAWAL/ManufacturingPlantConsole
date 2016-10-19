package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.Department;

public class DepartmentCreator {

	ArrayList<Department> departments = new ArrayList<>();

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	// CREATING OF DEPARTMENTS
	public ArrayList<Department> creatingDepartments() {
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
		return departments;
	}

	// show all departments
	public void showAllDepartments() {
		System.out.println("-----------------------------");
		System.out.println("Department List");
		for (Department department : departments) {
			System.out.println(department.toString());
		}
		System.out.println("-----------------------------");
	}

}
