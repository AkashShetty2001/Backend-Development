package com.myBasket.my_basket_app.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name  = "my-basket-address")
public class Address {


    @Column(name = "address_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    private String street;
    private String city;
    private String state;
    private String pinCode;
    private String country;

    @ManyToOne/* used to map many to one relationship between address and users
                 this act's as an foreign key in address table */
    @JoinColumn(name="user_id") //specifying foreign key column name
    private Users user;

    @OneToMany(mappedBy ="shippingAddress",
            cascade = {CascadeType.ALL})/* one address can have many orders*/
    private List<Order> order= new ArrayList<>();
    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
