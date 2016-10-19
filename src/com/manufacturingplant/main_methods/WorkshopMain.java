package com.manufacturingplant.main_methods;

import java.util.ArrayList;

import com.manufacturingplant.entities.Department;
import com.manufacturingplant.entities.Workshop;

//for addind chairman by constructor
import com.manufacturingplant.entities.WorkshopEmployee;

public class WorkshopMain {

	//creating of workshops
//	public static void creatingWorkshops() {
//		Workshop machiningWorkshop = new Workshop(1, "Machining Workshop", "Mijsun Vasyl Stepanovich");
//		Workshop galvanicWorkshop = new Workshop(2, "Galvanic Workshop", "Tarnavska Galyna Ivanivna");
//		Workshop forgingWorkshop = new Workshop(7, "Forging workshop", "Denys Yuriy Dmytrovich");
//		Workshop microassemblyWorkshop = new Workshop(8, "Microassembly Workshop", "Ynijat Igor Dmytrovych");
//		Workshop castingAndMoldingWorkshop = new Workshop(10, "Casting and molding workshop", "Thir Marija Prokopivna");
//		Workshop micromachiningWorkshop = new Workshop(20, "Micromachining workshop", "Bej Mukhailo Romanovych");
//		Workshop mechanicalWorkshop = new Workshop(34, "Mechanical Workshop", "Mytnuk Mukola Vasyliovych");
//		Workshop toolWorkshop = new Workshop(40, "Tool Workshop", "Lahin Viktor Paluch");
//	}
	
	//show all workshops
	public static ArrayList<Workshop> showAllWorkshops(){
		ArrayList<Workshop> workshops = new ArrayList<>();
		workshops.add(new Workshop(1, "Machining Workshop", "Mijsun Vasyl Stepanovich"));
		workshops.add(new Workshop(2, "Galvanic Workshop", "Tarnavska Galyna Ivanivna"));
		workshops.add(new Workshop(7, "Forging workshop", "Denys Yuriy Dmytrovich"));
		workshops.add(new Workshop(8, "Microassembly Workshop", "Ynijat Igor Dmytrovych"));
		workshops.add(new Workshop(10, "Casting and molding workshop", "Thir Marija Prokopivna"));
		workshops.add(new Workshop(20, "Micromachining workshop", "Bej Mukhailo Romanovych"));
		workshops.add(new Workshop(34, "Mechanical Workshop", "Mytnuk Mukola Vasyliovych"));
		workshops.add(new Workshop(40, "Tool Workshop", "Lahin Viktor Paluch"));
		for (Workshop workshop : workshops) {
			System.out.println(workshop);
		}		
		return workshops;
	}
	
	public static void main(String[] args) {

//		creatingWorkshops();
		showAllWorkshops();

	}
}
