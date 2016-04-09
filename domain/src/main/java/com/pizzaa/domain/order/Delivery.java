package com.pizzaa.domain.order;

/**
 * Created by jjpikoov on 4/9/16.
 */
public class Delivery {
    private int id;
    private int clientId;
    private int courierId;
    private String city;
    private String address;
    private String status;
    private int courierContactNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCourierContactNumber() {
        return courierContactNumber;
    }

    public void setCourierContactNumber(int courierContactNumber) {
        this.courierContactNumber = courierContactNumber;
    }
}
