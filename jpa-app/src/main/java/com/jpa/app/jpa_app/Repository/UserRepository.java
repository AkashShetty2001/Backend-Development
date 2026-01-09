package com.jpa.app.jpa_app.Repository;

import com.jpa.app.jpa_app.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<Users, Integer> {
}
