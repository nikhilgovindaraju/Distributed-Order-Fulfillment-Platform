package com.platform.order.model;

public class Order {
    private String orderId;
    private String product;
    private int quantity;
    private String customerLocation;

    // Getters and setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getCustomerLocation() { return customerLocation; }
    public void setCustomerLocation(String customerLocation) { this.customerLocation = customerLocation; }
}
