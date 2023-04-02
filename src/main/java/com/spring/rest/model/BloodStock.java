package com.spring.rest.model;

public class BloodStock {

    private int bloodstockId;
    private String bloodGroup;
    private int quantity;
    private String bestBefore;
    private String status;

    public BloodStock(int bloodstockId, String bloodGroup, int quantity, String bestBefore, String status) {
        this.bloodstockId = bloodstockId;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
        this.status = status;
    }

    public int getBloodstockId() {
        return bloodstockId;
    }

    public void setBloodstockId(int bloodstockId) {
        this.bloodstockId = bloodstockId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
