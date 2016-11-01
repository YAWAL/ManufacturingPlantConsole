package com.manufacturingplant.creators;

import java.util.Scanner;

import com.manufacturingplant.entities.WorkshopEmployee;

public class NewWorkshopEmployeeCreator extends WorkshopEmployee {

	public void createNewWorkshopEmployee() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("create new employee");
		WorkshopEmployee workshopEmployee = new WorkshopEmployee();

		System.out.println("Enter employee ID");
		workshopEmployee.setId(scanner.nextInt());

		System.out.println("Enter employee name");
		workshopEmployee.setName(scanner.next());

		System.out.println("Enter employee last name");
		workshopEmployee.setLastName(scanner.next());

		System.out.println("Enter employee adress");
		workshopEmployee.setAdress(scanner.next());

		System.out.println("Enter employee birth date");
		workshopEmployee.setDateOfBirdth(scanner.next());

		System.out.println("Enter employee phone number");
		workshopEmployee.setPhoneNumber(scanner.next());

		System.out.println("Enter employee position");
		workshopEmployee.setPosition(scanner.next());

		System.out.println("Enter employee salary");
		workshopEmployee.setSalary(scanner.nextInt());

		System.out.println("Enter employee start date");
		workshopEmployee.setStartDate(scanner.next());
		
//		System.out.println("Add employee to workshop");
//		System.out.println("1 - machinin ");
//		System.out.println("2 - galvanic  ");
//		System.out.println("7 - forging ");
//		System.out.println("8 - microassembly ");
//		System.out.println("10 - cast ");
//		System.out.println("20 - micromachining ");
//		System.out.println("34 - mechanical ");
//		System.out.println("40 - tool ");


//		WorkshopEmployeeCreator workshopEmployeeCreator = new WorkshopEmployeeCreator();
//		
//		switch (scanner.nextInt()) {
//		case 1:
//			workshopEmployeeCreator.createMachiningWorkshopEmployees();
//			break;
//		case 2:
//			workshopEmployeeCreator.createGalvanicWorkshopEmployees();
//			break;
//		case 7:
//			workshopEmployeeCreator.createForgingWorkshopEmployees();
//			break;
//		case 8:
//			workshopEmployeeCreator.createMicroassemblyWorkshopEmployees();
//			break;
//		case 10:
//			workshopEmployeeCreator.createCastingAndMouldingWorkshopEmployees();
//			break;
//		case 20:
//			workshopEmployeeCreator.createMicromachiningWorkshopEmployees();
//			break;
//		case 34:
//			workshopEmployeeCreator.createMechanicalWorkshopEmployees();
//			break;
//		case 40:
//			workshopEmployeeCreator.createToolWorkshopEmployees();
//			break;
//			
//		default:
//			break;
//		}
		System.out.println(workshopEmployee.toString());
	}

}
