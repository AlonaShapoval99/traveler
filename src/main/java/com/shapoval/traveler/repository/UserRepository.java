package com.shapoval.traveler.repository;

import com.shapoval.traveler.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndAndPassword(String email, String password);
}
