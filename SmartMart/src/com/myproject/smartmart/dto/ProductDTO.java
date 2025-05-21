package com.myproject.smartmart.dto;

public class ProductDTO {
    private String name;
    private String type;
    private String incomingPrice;
    private String sellingPrice;
    private String mrp;
    private String description;
    private String brand;
    private String quantity;
    private String color;
    private String weight;
    private String manufDate;
    private String warranty;
    private boolean returnable;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIncomingPrice() {
        return incomingPrice;
    }

    public void setIncomingPrice(String incomingPrice) {
        this.incomingPrice = incomingPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getManufDate() {
        return manufDate;
    }

    public void setManufDate(String manufDate) {
        this.manufDate = manufDate;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public boolean isReturnable() {
        return returnable;
    }

    public void setReturnable(boolean returnable) {
        this.returnable = returnable;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", incomingPrice='" + incomingPrice + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", mrp='" + mrp + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity='" + quantity + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manufDate='" + manufDate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnable=" + returnable +
                '}';
    }
}
