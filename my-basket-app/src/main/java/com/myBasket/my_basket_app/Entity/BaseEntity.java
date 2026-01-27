package com.myBasket.my_basket_app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.SQLDelete;
import org.springframework.context.event.EventListener;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
/*
@EntityListeners annotation is used to specify callback listener classes that should be invoked for entity lifecycle events, such as creation or update.
AuditingEntityListener is a built-in listener provided by Spring Data JPA that automatically populates auditing fields like createdAt and updatedAt.
 */
public abstract class BaseEntity {

    @Column(updatable = false)
    @CreatedDate
    /*@createdAt annotation is used to automatically set the creation timestamp of an entity when it is first persisted to the database.*/
    private LocalDateTime createdAt ;
    @LastModifiedDate
    /*@LastModifiedDate annotation is used to automatically update the timestamp of an entity whenever it is modified and saved to the database.*/
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private boolean isDeleted = false;


}
