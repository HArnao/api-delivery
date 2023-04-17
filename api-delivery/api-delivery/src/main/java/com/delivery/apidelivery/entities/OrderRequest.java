package com.delivery.apidelivery.entities;

import java.util.List;

public class OrderRequest {
    private String customerName;

    private String CustomerEmail;

    private List<Food> items;

    public OrderRequest(String customerName, String getCustomerEmail, List<Food> items) {
        this.customerName = customerName;
        this.CustomerEmail = getCustomerEmail;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String getCustomerEmail) {
        this.CustomerEmail = getCustomerEmail;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }
}
