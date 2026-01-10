package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //it is a configuration to ORM that , this is a table in db
//if we don't provide table name, by default class name will be table name
@Table(name="jpa_users") //specifying table name
public class Users {

    @Id //specifying primary key
    @Column(name="user_id") //specifying column name,by Default variable name will be column name
    private Integer userId;

    private String userName;

    @Column(unique=true, length = 100) //specifying unique constraint and length of column
    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
