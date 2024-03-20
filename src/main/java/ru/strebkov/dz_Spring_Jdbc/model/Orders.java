package ru.strebkov.dz_Spring_Jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Orders {
    private int order_id;
    private String order_data;
    private String product_name;
    private int amount;
    private int customer_id;

    public Orders(int order_id, String order_data, String product_name, int amount, int customer_id) {
        this.order_id = order_id;
        this.order_data = order_data;
        this.product_name = product_name;
        this.amount = amount;
        this.customer_id = customer_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_data() {
        return order_data;
    }

    public void setOrder_data(String order_data) {
        this.order_data = order_data;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", order_data='" + order_data + '\'' +
                ", product_name='" + product_name + '\'' +
                ", amount=" + amount +
                ", customer_id=" + customer_id +
                '}';
    }
}
