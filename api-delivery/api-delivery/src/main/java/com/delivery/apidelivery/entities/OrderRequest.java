package com.delivery.apidelivery.entities;

import java.util.List;

public class OrderRequest {
    private String customerName;

    private String getCustomerEmail;

    private List<Food> items;

    public OrderRequest(String customerName, String getCustomerEmail, List<Food> items) {
        this.customerName = customerName;
        this.getCustomerEmail = getCustomerEmail;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGetCustomerEmail() {
        return getCustomerEmail;
    }

    public void setGetCustomerEmail(String getCustomerEmail) {
        this.getCustomerEmail = getCustomerEmail;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }
}
