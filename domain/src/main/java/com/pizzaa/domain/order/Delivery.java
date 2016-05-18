package com.pizzaa.domain.order;

import javax.persistence.*;

/**
 * Created by jjpikoov on 4/9/16.
 */

@Entity(name = "delivery")
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private int clientId;

    @Column
    private int courierId;

    @Column
    private String city;

    @Column
    private String address;

    @Column
    private String status;

    @Column
    private int courierContactNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order1_id")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

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
