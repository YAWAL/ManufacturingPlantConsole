package com.manufacturingplant.entities;

import java.util.ArrayList;

/**
 * Created by VYA on 11.05.2016.
 */

public class Workshop {

	private int workshopId;

	private String workshopName;

	private String chairman;

	private ArrayList<WorkshopEmployee> workshopEmployeeList;

	private ArrayList<Tool> tools;

	private ArrayList<ProductionEquipment> productionEquipments;

	private ArrayList<NonProductionEquipment> nonProductionEquipments;

	private ArrayList<Material> materials;

	// private int employeeQuantity;

	// private int equipmentProdQuantity; // quantity of production equipments
	// in workshop
	//
	// private int equipmentNonprodQuantity; // quantity of nonproduction
	// equipments in workshop
	//
	// private int toolQuantity; // quantity of tools

	public Workshop() {
	}

	
	public Workshop(int workshopId, String workshopName, String chairman) {
		super();
		this.workshopId = workshopId;
		this.workshopName = workshopName;
		this.chairman = chairman;
	}

	public Workshop(int workshopId, String workshopName, String chairman,
			ArrayList<WorkshopEmployee> workshopEmployeeList, ArrayList<Tool> tools,
			ArrayList<ProductionEquipment> productionEquipments,
			ArrayList<NonProductionEquipment> nonProductionEquipments, ArrayList<Material> materials) {
		super();
		this.workshopId = workshopId;
		this.workshopName = workshopName;
		this.chairman = chairman;
		this.workshopEmployeeList = workshopEmployeeList;
		this.tools = tools;
		this.productionEquipments = productionEquipments;
		this.nonProductionEquipments = nonProductionEquipments;
		this.materials = materials;
	}
	
	

	public int getWorkshopId() {
		return workshopId;
	}

	public String getWorkshopName() {
		return workshopName;
	}

	public String getChairman() {
		return chairman;
	}

	public ArrayList<WorkshopEmployee> getWorkshopEmployeeList() {
		return workshopEmployeeList;
	}

	public ArrayList<Tool> getTools() {
		return tools;
	}

	public ArrayList<ProductionEquipment> getProductionEquipments() {
		return productionEquipments;
	}

	public ArrayList<NonProductionEquipment> getNonProductionEquipments() {
		return nonProductionEquipments;
	}

	public ArrayList<Material> getMaterials() {
		return materials;
	}

	public void setWorkshopId(int workshopId) {
		this.workshopId = workshopId;
	}

	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	public void setWorkshopEmployeeList(ArrayList<WorkshopEmployee> workshopEmployeeList) {
		this.workshopEmployeeList = workshopEmployeeList;
	}

	public void setTools(ArrayList<Tool> tools) {
		this.tools = tools;
	}

	public void setProductionEquipments(ArrayList<ProductionEquipment> productionEquipments) {
		this.productionEquipments = productionEquipments;
	}

	public void setNonProductionEquipments(ArrayList<NonProductionEquipment> nonProductionEquipments) {
		this.nonProductionEquipments = nonProductionEquipments;
	}

	public void setMaterials(ArrayList<Material> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "Workshop [workshopId=" + workshopId + ", workshopName=" + workshopName + ", chairman=" + chairman
				+ ", workshopEmployeeList=" + workshopEmployeeList + ", tools=" + tools + ", productionEquipments="
				+ productionEquipments + ", nonProductionEquipments=" + nonProductionEquipments + ", materials="
				+ materials + "]";
	}

    //TODO add equals() and hashCode()

}
