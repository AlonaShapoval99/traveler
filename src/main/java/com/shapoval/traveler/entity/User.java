package com.shapoval.traveler.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shapoval.traveler.model.UserModel;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "User_Traveller")
public class User {
    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private long userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "phone_number")
    private String userPhone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


    public User() {
    }

    public User(long userId, String userName, String userPhone, String email, String password,
                Role role) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(UserModel user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.userPhone = user.getUserPhone();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.role = user.getRole();
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
