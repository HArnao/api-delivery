package com.delivery.apidelivery.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String id;

    private String customerName;

    private String getCustomerName;

    private String status;

    private LocalDateTime creationTime;

    private LocalDateTime estimatedDeliveryTime;

    private List<Food> items;

    public Order(String id, String customerName, String getCustomerName, List<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.getCustomerName = getCustomerName;
        this.items = items;
        this.status = "confirmado";
        this.creationTime = LocalDateTime.now();
        this.estimatedDeliveryTime = this.creationTime.plusMinutes(30);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGetCustomerName() {
        return getCustomerName;
    }

    public void setGetCustomerName(String getCustomerName) {
        this.getCustomerName = getCustomerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }
}
