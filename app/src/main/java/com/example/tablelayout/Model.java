package com.example.tablelayout;

public class Model {
    String id;
    String name;
    String payment;

    public Model(String id, String name, String payment) {
        this.id = id;
        this.name = name;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
