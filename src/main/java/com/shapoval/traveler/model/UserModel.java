package com.shapoval.traveler.model;

import com.shapoval.traveler.entity.Role;
import com.shapoval.traveler.entity.User;

public class UserModel {
    private long userId;
    private String userName;
    private String userPhone;
    private String email;
    private String password;
    private RoleModel role;

    public UserModel() {
    }

    public UserModel(long userId, String userName, String userPhone, String email, String password,
                     RoleModel role) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserModel(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
        this.userPhone = user.getUserPhone();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.role = new RoleModel(user.getRole());
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

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }

}
