package com.manufacturingplant.entities;

/**
 * Created by VYA on 11.05.2016.
 */

public class ProductionEquipment {

    
    private int id;

    
    private String prodEquipName;   // production equipment name, f.e. "MILLING MACHINE" , "TURNING CENTRE", etc.

    
    private int quantity;           // quantity of equipments installed in determined workshop

    
    private String description;     // brief description of equipment

    
    private String manufacturer;

    
    private String vendor;

    
    private String productionYear;  // year when equipment was produced

    
    private String startDate;       // date when equipment started work

    
    private int cost;            // equipment cost in UAH

    private Workshop workshop;



    public ProductionEquipment() {
    }

    public ProductionEquipment(String prodEquipName, int quantity, String description,
                               String manufacturer, String vendor, String productionYear, String startDate, int cost) {
        this.prodEquipName = prodEquipName;
        this.quantity = quantity;
        this.description = description;
        this.manufacturer = manufacturer;
        this.vendor = vendor;
        this.productionYear = productionYear;
        this.startDate = startDate;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdEquipName() {
        return prodEquipName;
    }

    public void setProdEquipName(String prodEquipName) {
        this.prodEquipName = prodEquipName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }





}
