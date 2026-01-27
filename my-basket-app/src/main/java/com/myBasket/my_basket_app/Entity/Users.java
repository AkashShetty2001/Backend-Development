package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.util.ArrayList;
import java.util.List;

@Entity //it is a configuration to ORM that , this is a table in db
//if we don't provide table name, by default class name will be table name
@Table(name="my-basket-users") //specifying table name
@SQLDelete(sql = "UPDATE  `my-basket-users` SET is_deleted = true WHERE user_id=?")
@SQLRestriction("is_deleted=false")
public class Users extends BaseEntity{

    @Id //specifying primary key
    @Column(name="user_id") //specifying column name,by Default variable name will be column name
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment strategy
    private Integer userId;

    private String userName;

    @Column(unique=true, length = 100) //specifying unique constraint and length of column
    private String email;

    private String password;

    private String userImageUrl;

    @OneToMany(mappedBy = "user",/*used to map one to many relationship between users and address,
                 so because of this , since it is a list, it will create a separate table to store users and address relationship,
                 when ever we are dealing with list or set, and even bi-directional relationship we have to use mappedBy attribute to avoid to avoid creating extra table, for mappedBy we have to specify the variable name(Foreign Key) in the other class
                 */
               fetch =FetchType.LAZY,
               cascade = CascadeType.ALL,
               orphanRemoval = false)
    /*
                    fetch attribute is used to specify how the related entities should be loaded from the database.
                    LAZY fetching means that the related entities are not loaded from the database until they are accessed for the first time.
                    EAGER fetching means that the related entities are loaded from the database immediately along with the parent entity.
                    like when we load a user, all the addresses related to that user should not be loaded immediately, they should be loaded only when we access the addressList variable
     */
    /*
                    cascade attribute is used to specify the cascade operations that should be applied to the related entities.
                    CascadeType.ALL means that all cascade operations (persist, merge, remove, refresh, detach) should be applied to the related entities.
                    like we delete a user, all the addresses related to that user should also be deleted automatically
     */

    /*
                    orphanRemoval attribute is used to specify whether to automatically remove orphaned entities.
                    when we remove an address from the addressList, that address should be deleted from the database automatically.
                    like if we remove an address from the addressList, that address should be deleted from the database automatically
                    and any adddress which is not associated with any user should be deleted from the database automatically.
     */


    private List<Address> addressList = new ArrayList<>();


    @OneToMany(mappedBy = "users",
               fetch = FetchType.LAZY,
               cascade = CascadeType.ALL)
    /* one user can have many orders */
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "user",
               fetch = FetchType.LAZY,
               cascade = CascadeType.ALL)
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user",
               fetch = FetchType.LAZY,
               cascade = CascadeType.ALL)
    /*
        one user can have many payment method info
     */
    private List<PaymentMethodInfo> paymentMethodInfo;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }
}
